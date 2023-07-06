package ru.gazprom.gptrans.signatury.dto;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "docId",
        "state",
        "stateName",
        "ecpOperId",
        "ecpPathID",
        "version"
})
@XmlRootElement(name = "setECPReply")
public class SetECPReply {
    @XmlElement(name = "docID")
    protected AttributeValueLong docId;
    @XmlElement(name = "state")
    protected AttributeValueLong state;
    @XmlElement(name = "stateName")
    protected AttributeValueString stateName;
    @XmlElement(name = "ECPoperID")
    protected AttributeValueLong ecpOperId;
    @XmlElement(name = "ECPpathID")
    protected AttributeValueLong ecpPathID;
    @XmlElement(name = "version")
    protected AttributeValueLong version;

    public AttributeValueLong getDocId() {
        return docId;
    }

    public AttributeValueLong getState() {
        return state;
    }

    public AttributeValueString getStateName() {
        return stateName;
    }

    public AttributeValueLong getEcpOperId() {
        return ecpOperId;
    }

    public AttributeValueLong getEcpPathID() {
        return ecpPathID;
    }

    public AttributeValueLong getVersion() {
        return version;
    }
}
