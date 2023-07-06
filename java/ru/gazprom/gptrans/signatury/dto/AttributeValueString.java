package ru.gazprom.gptrans.signatury.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class AttributeValueString {
    @XmlAttribute(name = "value", required = true)
    protected String valueAttribute;

    public AttributeValueString() {
    }

    public AttributeValueString(String valueAttribute) {
        this.valueAttribute = valueAttribute;
    }

    public String getValueAttribute() {
        return valueAttribute;
    }

    public void setValueAttribute(String value) {
        this.valueAttribute = value;
    }
}
