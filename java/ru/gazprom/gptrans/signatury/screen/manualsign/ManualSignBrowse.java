package ru.gazprom.gptrans.signatury.screen.manualsign;

import io.jmix.core.DataManager;
import io.jmix.ui.action.Action;
import io.jmix.ui.action.list.RefreshAction;
import io.jmix.ui.component.DataGrid;
import io.jmix.ui.screen.*;
import org.springframework.beans.factory.annotation.Autowired;
import ru.gazprom.gptrans.signatury.dto.GetTextForECPReply;
import ru.gazprom.gptrans.signatury.dto.generated.ECPWaitDocStatusReplay;
import ru.gazprom.gptrans.signatury.dto.generated.ECPWaitDocument;
import ru.gazprom.gptrans.signatury.entity.DocSettings;
import ru.gazprom.gptrans.signatury.entity.ManualSign;
import ru.gazprom.gptrans.signatury.service.DigitalSignatureService;
import ru.gazprom.gptrans.signatury.service.Test;

import javax.inject.Named;
import java.security.Signature;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.stream.Collectors;

@UiController("sign_ManualSign.browse")
@UiDescriptor("manual-sign-browse.xml")
@LookupComponent("manualSignsTable")
public class ManualSignBrowse extends StandardLookup<ManualSign> {
    @Autowired
    private DataGrid<ManualSign> manualSignsTable;
    @Autowired
    private Test test;
    @Autowired
    private DigitalSignatureService digitalSignatureService;
    @Autowired
    private DataManager dataManager;
    @Named("manualSignsTable.refreshAction")
    private RefreshAction refreshAction;

    @Subscribe("manualSignsTable.signDocument")
    public void onManualSignsTableSignDocument(Action.ActionPerformedEvent event) {
        for (ManualSign record : manualSignsTable.getSelected()) {
//            byte[] sign = digitalSignatureService.signData(record.getDocumentId().intValue(), record.getFile().getBytes());
//            String request = test.getRequestSetEcp(record.getDocumentId(), record.getFile(), sign.toString(), null);
//            SetECPReply setECPReply = test.getResponseSetEcp(request);
//            if (setECPReply != null) {
                record.setSignedDate(LocalDateTime.now());
                record.setUserSigned("Якуня Н.М.");
           // }
//            System.out.println(record.getDocumentId());
//            System.out.println(manualSignsTable.getFrozenColumnCount());
        }
        manualSignsTable.deselectAll();
    }

    @Subscribe("manualSignsTable.getDocument")
    public void onManualSignsTableGetDocument(Action.ActionPerformedEvent event) {
        String request = test.getRequestECPWaitDocStatus(LocalDateTime.now().with(LocalTime.MIN), LocalDateTime.now().with(LocalTime.MAX));
        ECPWaitDocStatusReplay ecpWaitDocStatusReplay = test.getResponseECPWaitDocStatus(request);
        List<DocSettings> docSettings = dataManager.load(DocSettings.class).all().list();
        for (ECPWaitDocument ecpWaitDocument : ecpWaitDocStatusReplay.getECPWaitDocument()) {
            //по каждому документу получем доп инфу
            List<Integer> ecpDocTypes = docSettings.stream()
                    .filter(e -> e.getDocType().getDocTypeId() == ecpWaitDocument.getDocument().getDocType().getDocTypeId())
                    .map(e -> e.getEcpDocType().getEcpDocTypeId())
                    .collect(Collectors.toList());
            //if (ecpDocTypes.contains(ecpWaitDocument.getECPDocType().getECPDocTypeID())) {
                String requestInfo = test.getRequestGetTextForECP(ecpWaitDocument.getDocument().getDOCID());
                if (requestInfo != null) {
                    GetTextForECPReply getTextForECPReply = test.getResponseGetTextForECP(requestInfo);
                    ManualSign manualSign = dataManager.create(ManualSign.class);
                    manualSign.setDocumentId(getTextForECPReply.getDocId().getValueAttribute());
                    manualSign.setFile(getTextForECPReply.getText().getValueAttribute());
                    manualSign.setReceivedDate(LocalDateTime.now());
                    dataManager.save(manualSign);
                }
            //}
        }
        refreshAction.execute();
    }
}