package ru.gazprom.gptrans.signatury.service;

import io.jmix.core.DataManager;
import io.jmix.core.security.Authenticated;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import ru.gazprom.gptrans.signatury.dto.GetTextForECPReply;
import ru.gazprom.gptrans.signatury.dto.generated.ECPWaitDocStatusReplay;
import ru.gazprom.gptrans.signatury.dto.generated.ECPWaitDocument;
import ru.gazprom.gptrans.signatury.entity.DocSettings;
import ru.gazprom.gptrans.signatury.entity.ECPDocType;
import ru.gazprom.gptrans.signatury.entity.EventLog;
import ru.gazprom.gptrans.signatury.entity.LogOperations;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.stream.Collectors;

public class SigningJobs implements Job {
    private final Test test;
    @Autowired
    private DataManager dataManager;

    @Autowired
    public SigningJobs(Test test) {
        this.test = test;
    }

    @Authenticated
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        int i = 1;
        while (true) {
            String request = test.getRequestECPWaitDocStatus(LocalDateTime.now().with(LocalTime.MIN), LocalDateTime.now().with(LocalTime.MAX));
//            EventLog eventLog = dataManager.create(EventLog.class);
//            eventLog.setOperation(LogOperations.REQUEST_LIST_DOCUMENTS);
//            dataManager.save(eventLog);
            ECPWaitDocStatusReplay ecpWaitDocStatusReplay = test.getResponseECPWaitDocStatus(request);
            List<DocSettings> docSettings = dataManager.load(DocSettings.class).all().list();
            //зачем 5 раз посылать запрос не очень понимаю, но зачем то из версии к версии подписанта мы это делаем
            if (ecpWaitDocStatusReplay.getECPWaitDocument().size() == 0) {
                i--;
                if (i < 0) break;
            } else {
                //получаем список документов
                for (ECPWaitDocument ecpWaitDocument : ecpWaitDocStatusReplay.getECPWaitDocument()) {
                    //по каждому документу получем доп инфу
                    List<Integer> ecpDocTypes = docSettings.stream()
                            .filter(e -> e.getDocType().getDocTypeId() == ecpWaitDocument.getDocument().getDocType().getDocTypeId())
                            .map(e -> e.getEcpDocType().getEcpDocTypeId())
                            .collect(Collectors.toList());
                    if (ecpDocTypes.contains(ecpWaitDocument.getECPDocType().getECPDocTypeID())) {
                        String requestInfo = test.getRequestGetTextForECP(ecpWaitDocument.getDocument().getDOCID());
                        GetTextForECPReply getTextForECPReply = test.getResponseGetTextForECP(requestInfo);
                    }
                    //подписываем
                }
                break;
            }
        }
    }
}
