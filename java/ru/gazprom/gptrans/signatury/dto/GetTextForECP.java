package ru.gazprom.gptrans.signatury.dto;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTextForECP", namespace = "http://service.siw.pktbcki.rzd/", propOrder = {
        "docId"
})
@XmlRootElement(name = "GetTextForECP")
public class GetTextForECP {
    @XmlElement(name = "docID")
    protected AttributeValueLong docId;

    public void setDocId(AttributeValueLong docId) {
        this.docId = docId;
    }
}



