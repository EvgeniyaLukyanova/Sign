package ru.gazprom.gptrans.signatury.dto;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "userId",
        "userFIO",
        "docId",
        "text"
})
@XmlRootElement(name = "getTextForECPReply")
public class GetTextForECPReply {
    @XmlElement(name = "userID")
    protected AttributeValueLong userId;
    @XmlElement(name = "userFIO")
    protected AttributeValueString userFIO;
    @XmlElement(name = "DocID")
    protected AttributeValueLong docId;
    @XmlElement(name = "text")
    protected AttributeValueString text;

    public AttributeValueLong getUserId() {
        return userId;
    }

    public AttributeValueString getUserFIO() {
        return userFIO;
    }

    public AttributeValueLong getDocId() {
        return docId;
    }

    public AttributeValueString getText() {
        return text;
    }
}
