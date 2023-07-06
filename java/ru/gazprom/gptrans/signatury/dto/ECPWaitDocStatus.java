package ru.gazprom.gptrans.signatury.dto;

//import jakarta.xml.bind.JAXBElement;
//import jakarta.xml.bind.annotation.*;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.time.LocalDateTime;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ecpWaitDocStatus", namespace = "http://service.siw.pktbcki.rzd/", propOrder = {
        "fromDate",
        "toDate"
})
@XmlRootElement(name = "ECPWaitDocStatus")
public class ECPWaitDocStatus {
    @XmlElement(name = "fromDate", required = true)
    protected /*JAXBElement<XMLGregorianCalendar>*/ String fromDate;
    @XmlElement(name = "toDate", required = true)
    protected /*JAXBElement<XMLGregorianCalendar>*/ String toDate;

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }
}
