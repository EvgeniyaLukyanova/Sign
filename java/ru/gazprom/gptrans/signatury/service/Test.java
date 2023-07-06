package ru.gazprom.gptrans.signatury.service;

import io.jmix.core.DataManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import ru.gazprom.gptrans.signatury.client.generated.IEtranSys;
import ru.gazprom.gptrans.signatury.client.generated.IEtranSysservice;
import ru.gazprom.gptrans.signatury.dto.*;
import ru.gazprom.gptrans.signatury.dto.generated.ECPWaitDocStatusReplay;
import ru.gazprom.gptrans.signatury.dto.generated.ObjectFactory;
import javax.annotation.PostConstruct;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.ws.Holder;
import java.io.StringReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import ru.gazprom.gptrans.signatury.entity.EtrConnectOption;
import ru.gazpromtrans.utils.XMLUtils;

@Service
public class Test {
    private final ObjectFactory objectFactory = new ObjectFactory();
    private IEtranSysservice iEtranSysservice;
    private DataManager dataManager;
/*
    @Value("${etran.user}")
    private String user;

    @Value("${etran.password}")
    private String password;*/

    @Autowired
    public Test(IEtranSysservice iEtranSysservice, DataManager dataManager) {
        this.iEtranSysservice = iEtranSysservice;
        this.dataManager = dataManager;
    }

    protected String getObject2String(Object value){
        String textRequest = "";
        try {
            textRequest = XMLUtils.object2String(XMLUtils.getJAXBObject(value.getClass(),
                    value.getClass().getSimpleName().replace("Get", "get"), value), value.getClass());
        } catch (JAXBException e) {
            //LOGGER.error("Object transformation failed. RequestClassName: {}", ReferenceSPV4650Request.class);
            throw new RuntimeException(e);
        }
        return textRequest;
    }

    public String getRequestECPWaitDocStatus(LocalDateTime fromDate, LocalDateTime toDate) {
        ECPWaitDocStatus ecpWaitDocStatus = new ECPWaitDocStatus();

        DateTimeFormatter dTF = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        try {
            //XMLGregorianCalendar fromDateGC = DatatypeFactory.newInstance().newXMLGregorianCalendar(
            //        GregorianCalendar.from(fromDate.atZone(ZoneId.systemDefault())));
            //ecpWaitDocStatus.setFromDate(objectFactory.createECPWaitDocStatusFromDate(fromDateGC));
            ecpWaitDocStatus.setFromDate(fromDate.format(dTF));
        } catch (Exception e){
            System.out.println("я тут");
        }
        try {
            //XMLGregorianCalendar toDateGC = DatatypeFactory.newInstance().newXMLGregorianCalendar(
            //        GregorianCalendar.from(toDate.atZone(ZoneId.systemDefault())));
            //ecpWaitDocStatus.setToDate(objectFactory.createECPWaitDocStatusToDate(toDateGC));
            ecpWaitDocStatus.setToDate(toDate.format(dTF));
        } catch (Exception e){
            System.out.println("я тут");
        }

        return getObject2String(ecpWaitDocStatus);
     }

    public ECPWaitDocStatusReplay getResponseECPWaitDocStatus(String request) {
        String etranBlock = getEtranBlock(request);
        System.out.println(etranBlock);
        //LOG.debug("Response from ETRAN for References 4664:\n{}", etranBlock);
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(ECPWaitDocStatusReplay.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            return (ECPWaitDocStatusReplay) unmarshaller.unmarshal(new StringReader(etranBlock));
        } catch (JAXBException e) {
            //LOG.error("Object transformation failed. RequestClassName: {}", Envelope.class);
            //throw new RuntimeException("", e);
            System.out.println(e.getMessage());
            return null;
        }
    }

    public String getRequestGetTextForECP(Long id) {
        GetTextForECP getTextForECP = new GetTextForECP();
        getTextForECP.setDocId(new AttributeValueLong(id));
        return getObject2String(getTextForECP);
    }

    public GetTextForECPReply getResponseGetTextForECP(String request) {
        String etranBlock = getEtranBlock(request);
        System.out.println(etranBlock);
        //LOG.debug("Response from ETRAN for References 4664:\n{}", etranBlock);
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(GetTextForECPReply.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            String str = new StringReader(etranBlock).toString();
            return (GetTextForECPReply) unmarshaller.unmarshal(new StringReader(etranBlock));
        } catch (JAXBException e) {
            //LOG.error("Object transformation failed. RequestClassName: {}", Envelope.class);
            //throw new RuntimeException("", e);
            System.out.println(e.getMessage());
            return null;
        }
    }

    public String getRequestSetEcp(Long id, String text, String ecp, String tsp) {
        SetECP setECP = new SetECP();
        setECP.setDocId(new AttributeValueLong(id));
        setECP.setText(new AttributeValueString(text));
        setECP.setEcp(new AttributeValueString(ecp));
        setECP.setTsp(new AttributeValueString(tsp));
        setECP.setVersion(new AttributeValueLong(1L));
        return getObject2String(setECP);
    }

    public SetECPReply getResponseSetEcp(String request) {
        String etranBlock = getEtranBlock(request);
        System.out.println(etranBlock);
        //LOG.debug("Response from ETRAN for References 4664:\n{}", etranBlock);
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(SetECPReply.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            String str = new StringReader(etranBlock).toString();
            return (SetECPReply) unmarshaller.unmarshal(new StringReader(etranBlock));
        } catch (JAXBException e) {
            //LOG.error("Object transformation failed. RequestClassName: {}", Envelope.class);
            //throw new RuntimeException("", e);
            return null;
        }
    }

    //из класса tranIntegrationServiceImpl

    public String getEtranBlock(String request) {
        //заменить, так как будет несколько строк в таблице
        EtrConnectOption one = dataManager.load(EtrConnectOption.class).all().one();
        //
        String outputText = getEtranBlock(one.getUserName(), one.getPassword(), request);
//        if (request.contains("<UseGZIPBinary>1</UseGZIPBinary>")) {
//            outputText = unpackServerResponse(outputText);
//        }
        return outputText;
    }

    public String getEtranBlock(String userName, String userPassword, String request) {
        IEtranSys port = iEtranSysservice.getIEtranSysPort();
        Holder<String> requestHolder = new Holder<>();
        requestHolder.value = request;
        port.getBlock(userName, userPassword, requestHolder);
        String output = requestHolder.value;

        if (output.toLowerCase().contains("<error>")) {
            //LOGGER.error("An error occurred on the server while generating the response, the server response {}", output);
            return output;
        }

        return output;
    }

}
