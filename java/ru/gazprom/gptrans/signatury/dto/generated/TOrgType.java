//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.06.07 at 10:00:57 AM MSK 
//


package ru.gazprom.gptrans.signatury.dto.generated;

//import jakarta.xml.bind.annotation.XmlAccessType;
//import jakarta.xml.bind.annotation.XmlAccessorType;
//import jakarta.xml.bind.annotation.XmlElement;
//import jakarta.xml.bind.annotation.XmlType;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Тип организации
 * 
 * <p>Java class for TOrgType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TOrgType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrgTypeId" type="{http://intellex.ru/Etran/ASUASU/Categories}IDLongType"/&gt;
 *         &lt;element name="OrgTypeName" type="{http://intellex.ru/Etran/ASUASU/Categories}String100Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TOrgType", propOrder = {
    "orgTypeId",
    "orgTypeName"
})
public class TOrgType {

    @XmlElement(name = "OrgTypeId")
    protected long orgTypeId;
    @XmlElement(name = "OrgTypeName", required = true)
    protected String orgTypeName;

    /**
     * Gets the value of the orgTypeId property.
     * 
     */
    public long getOrgTypeId() {
        return orgTypeId;
    }

    /**
     * Sets the value of the orgTypeId property.
     * 
     */
    public void setOrgTypeId(long value) {
        this.orgTypeId = value;
    }

    /**
     * Gets the value of the orgTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgTypeName() {
        return orgTypeName;
    }

    /**
     * Sets the value of the orgTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgTypeName(String value) {
        this.orgTypeName = value;
    }

}