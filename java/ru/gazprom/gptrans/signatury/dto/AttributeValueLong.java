package ru.gazprom.gptrans.signatury.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class AttributeValueLong {
    @XmlAttribute(name = "value", required = true)
    protected Long valueAttribute;

    public AttributeValueLong() {
    }

    public AttributeValueLong(Long valueAttribute) {
        this.valueAttribute = valueAttribute;
    }

    public Long getValueAttribute() {
        return valueAttribute;
    }

    public void setValueAttribute(Long value) {
        this.valueAttribute = value;
    }
}
