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
 * Должность
 * 
 * <p>Java class for TOrgPost complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TOrgPost"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PostId" type="{http://intellex.ru/Etran/ASUASU/Categories}IDShortPosType"/&gt;
 *         &lt;element name="PostName" type="{http://intellex.ru/Etran/ASUASU/Categories}String100Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TOrgPost", propOrder = {
    "postId",
    "postName"
})
public class TOrgPost {

    @XmlElement(name = "PostId")
    protected int postId;
    @XmlElement(name = "PostName", required = true)
    protected String postName;

    /**
     * Gets the value of the postId property.
     * 
     */
    public int getPostId() {
        return postId;
    }

    /**
     * Sets the value of the postId property.
     * 
     */
    public void setPostId(int value) {
        this.postId = value;
    }

    /**
     * Gets the value of the postName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostName() {
        return postName;
    }

    /**
     * Sets the value of the postName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostName(String value) {
        this.postName = value;
    }

}
