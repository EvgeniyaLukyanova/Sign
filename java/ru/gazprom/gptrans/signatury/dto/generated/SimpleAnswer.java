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
//import jakarta.xml.bind.annotation.XmlSeeAlso;
//import jakarta.xml.bind.annotation.XmlType;


import javax.xml.bind.annotation.*;

/**
 * Базовый тип для всех ответов АС Этран
 * 
 * <p>Java class for SimpleAnswer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimpleAnswer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Warning" type="{http://intellex.ru/Etran/ASUASU/Categories}LongStringType" minOccurs="0"/&gt;
 *         &lt;element name="errorCode" type="{http://intellex.ru/Etran/ASUASU/Categories}errorCodeType" minOccurs="0"/&gt;
 *         &lt;element name="errorMessage" type="{http://intellex.ru/Etran/ASUASU/Categories}LongStringType" minOccurs="0"/&gt;
 *         &lt;element name="errorStatusCode" type="{http://intellex.ru/Etran/ASUASU/Categories}errorStatusCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleAnswer", propOrder = {
    "warning",
    "errorCode",
    "errorMessage",
    "errorStatusCode"
})
@XmlSeeAlso({
    SimpleStatusAnswer.class
})
public class SimpleAnswer {

    @XmlElement(name = "Warning")
    protected String warning;
    protected Integer errorCode;
    protected String errorMessage;
    protected Integer errorStatusCode;

    /**
     * Gets the value of the warning property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarning() {
        return warning;
    }

    /**
     * Sets the value of the warning property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarning(String value) {
        this.warning = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setErrorCode(Integer value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the errorStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getErrorStatusCode() {
        return errorStatusCode;
    }

    /**
     * Sets the value of the errorStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setErrorStatusCode(Integer value) {
        this.errorStatusCode = value;
    }

}
