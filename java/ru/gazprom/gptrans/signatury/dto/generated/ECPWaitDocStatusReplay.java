//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.06.07 at 10:00:57 AM MSK 
//


package ru.gazprom.gptrans.signatury.dto.generated;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
//import jakarta.xml.bind.annotation.XmlAccessType;
//import jakarta.xml.bind.annotation.XmlAccessorType;
//import jakarta.xml.bind.annotation.XmlElement;
//import jakarta.xml.bind.annotation.XmlRootElement;
//import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}SimpleStatusAnswer"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}ECPWaitDocument" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ecpWaitDocument"
})
@XmlRootElement(name = "ECPWaitDocStatusReplay")
public class ECPWaitDocStatusReplay
    extends SimpleStatusAnswer
{

    @XmlElement(name = "ECPWaitDocument")
    protected List<ECPWaitDocument> ecpWaitDocument;

    /**
     * Gets the value of the ecpWaitDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the ecpWaitDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getECPWaitDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ECPWaitDocument }
     * 
     * 
     */
    public List<ECPWaitDocument> getECPWaitDocument() {
        if (ecpWaitDocument == null) {
            ecpWaitDocument = new ArrayList<ECPWaitDocument>();
        }
        return this.ecpWaitDocument;
    }

}
