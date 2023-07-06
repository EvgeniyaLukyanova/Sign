package ru.gazprom.gptrans.signatury.dto;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setECP", namespace = "http://service.siw.pktbcki.rzd/", propOrder = {
        "docId",
        "text",
        "ecp",
        "tsp",
        "version"
})
@XmlRootElement(name = "setECP")
public class SetECP {
    @XmlElement(name = "docID")
    protected AttributeValueLong docId;
    @XmlElement(name = "text")
    protected AttributeValueString text;
    @XmlElement(name = "ecp")
    protected AttributeValueString ecp;
    @XmlElement(name = "tsp")
    protected AttributeValueString tsp;
    @XmlElement(name = "version")
    protected AttributeValueLong version;

    public void setDocId(AttributeValueLong docId) {
        this.docId = docId;
    }

    public void setText(AttributeValueString text) {
        this.text = text;
    }

    public void setEcp(AttributeValueString ecp) {
        this.ecp = ecp;
    }

    public void setTsp(AttributeValueString tsp) {
        this.tsp = tsp;
    }

    public void setVersion(AttributeValueLong version) {
        this.version = version;
    }
}
