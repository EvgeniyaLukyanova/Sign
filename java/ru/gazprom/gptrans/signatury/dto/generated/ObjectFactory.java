//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.06.07 at 10:00:57 AM MSK 
//


package ru.gazprom.gptrans.signatury.dto.generated;

import ru.gazprom.gptrans.signatury.dto.ECPWaitDocStatus;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DocState_QNAME = new QName("", "DocState");
    private final static QName _DocType_QNAME = new QName("", "DocType");
    private final static QName _Error_QNAME = new QName("", "error");
    private final static QName _ECPWaitDocStatus_QNAME = new QName("", "ECPWaitDocStatus");
    private final static QName _ECPDocType_QNAME = new QName("", "ECPDocType");
    private final static QName _ECPWaitDocStatusFromDate_QNAME = new QName("", "fromDate");
    private final static QName _ECPWaitDocStatusToDate_QNAME = new QName("", "toDate");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ErrorAnswer }
     * 
     */
    public ErrorAnswer createErrorAnswer() {
        return new ErrorAnswer();
    }

    /**
     * Create an instance of {@link DocStateType }
     * 
     */
    public DocStateType createDocStateType() {
        return new DocStateType();
    }

    /**
     * Create an instance of {@link DocTypeType }
     * 
     */
    public DocTypeType createDocTypeType() {
        return new DocTypeType();
    }

    /**
     * Create an instance of {@link SimpleDocumentStatusReply }
     * 
     */
    public SimpleDocumentStatusReply createSimpleDocumentStatusReply() {
        return new SimpleDocumentStatusReply();
    }

    /**
     * Create an instance of {@link SimpleStatusAnswer }
     * 
     */
    public SimpleStatusAnswer createSimpleStatusAnswer() {
        return new SimpleStatusAnswer();
    }

    /**
     * Create an instance of {@link SimpleAnswer }
     * 
     */
    public SimpleAnswer createSimpleAnswer() {
        return new SimpleAnswer();
    }

    /**
     * Create an instance of {@link SimpleDocument }
     * 
     */
    public SimpleDocument createSimpleDocument() {
        return new SimpleDocument();
    }

    /**
     * Create an instance of {@link SimpleStatus }
     * 
     */
    public SimpleStatus createSimpleStatus() {
        return new SimpleStatus();
    }

    /**
     * Create an instance of {@link ECPWaitDocStatusReplay }
     * 
     */
    public ECPWaitDocStatusReplay createECPWaitDocStatusReplay() {
        return new ECPWaitDocStatusReplay();
    }

    /**
     * Create an instance of {@link ECPWaitDocument }
     * 
     */
    public ECPWaitDocument createECPWaitDocument() {
        return new ECPWaitDocument();
    }

    /**
     * Create an instance of {@link ECPDocTypeType }
     * 
     */
    public ECPDocTypeType createECPDocTypeType() {
        return new ECPDocTypeType();
    }

    /**
     * Create an instance of {@link FilteredStatus }
     * 
     */
    public FilteredStatus createFilteredStatus() {
        return new FilteredStatus();
    }

    /**
     * Create an instance of {@link ForeingKeyDocument }
     * 
     */
    public ForeingKeyDocument createForeingKeyDocument() {
        return new ForeingKeyDocument();
    }

    /**
     * Create an instance of {@link TOrgType }
     * 
     */
    public TOrgType createTOrgType() {
        return new TOrgType();
    }

    /**
     * Create an instance of {@link TOrganization }
     * 
     */
    public TOrganization createTOrganization() {
        return new TOrganization();
    }

    /**
     * Create an instance of {@link TOrgPost }
     * 
     */
    public TOrgPost createTOrgPost() {
        return new TOrgPost();
    }

    /**
     * Create an instance of {@link TUser }
     * 
     */
    public TUser createTUser() {
        return new TUser();
    }

    /**
     * Create an instance of {@link TOrgUser }
     * 
     */
    public TOrgUser createTOrgUser() {
        return new TOrgUser();
    }

    /**
     * Create an instance of {@link TStation }
     * 
     */
    public TStation createTStation() {
        return new TStation();
    }

    /**
     * Create an instance of {@link TCar }
     * 
     */
    public TCar createTCar() {
        return new TCar();
    }

    /**
     * Create an instance of {@link TBusinessFunction }
     * 
     */
    public TBusinessFunction createTBusinessFunction() {
        return new TBusinessFunction();
    }

    /**
     * Create an instance of {@link TBusinessFunctionResult }
     * 
     */
    public TBusinessFunctionResult createTBusinessFunctionResult() {
        return new TBusinessFunctionResult();
    }

    /**
     * Create an instance of {@link TOperation }
     * 
     */
    public TOperation createTOperation() {
        return new TOperation();
    }

    /**
     * Create an instance of {@link ErrorAnswer.ErrorCode }
     * 
     */
    public ErrorAnswer.ErrorCode createErrorAnswerErrorCode() {
        return new ErrorAnswer.ErrorCode();
    }

    /**
     * Create an instance of {@link ErrorAnswer.ErrorMessage }
     * 
     */
    public ErrorAnswer.ErrorMessage createErrorAnswerErrorMessage() {
        return new ErrorAnswer.ErrorMessage();
    }

    /**
     * Create an instance of {@link ErrorAnswer.ErrorStatusCode }
     * 
     */
    public ErrorAnswer.ErrorStatusCode createErrorAnswerErrorStatusCode() {
        return new ErrorAnswer.ErrorStatusCode();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocStateType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocStateType }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "DocState")
    public JAXBElement<DocStateType> createDocState(DocStateType value) {
        return new JAXBElement<DocStateType>(_DocState_QNAME, DocStateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocTypeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocTypeType }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "DocType")
    public JAXBElement<DocTypeType> createDocType(DocTypeType value) {
        return new JAXBElement<DocTypeType>(_DocType_QNAME, DocTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorAnswer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ErrorAnswer }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "error")
    public JAXBElement<ErrorAnswer> createError(ErrorAnswer value) {
        return new JAXBElement<ErrorAnswer>(_Error_QNAME, ErrorAnswer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleStatus }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SimpleStatus }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ECPWaitDocStatus")
    public JAXBElement<SimpleStatus> createECPWaitDocStatus(SimpleStatus value) {
        return new JAXBElement<SimpleStatus>(_ECPWaitDocStatus_QNAME, SimpleStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ECPDocTypeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ECPDocTypeType }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ECPDocType")
    public JAXBElement<ECPDocTypeType> createECPDocType(ECPDocTypeType value) {
        return new JAXBElement<ECPDocTypeType>(_ECPDocType_QNAME, ECPDocTypeType.class, null, value);
    }

    @XmlElementDecl(namespace = "", name = "fromDate", scope = ECPWaitDocStatus.class)
    public JAXBElement<XMLGregorianCalendar> createECPWaitDocStatusFromDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ECPWaitDocStatusFromDate_QNAME, XMLGregorianCalendar.class, ECPWaitDocStatus.class, value);
    }

    @XmlElementDecl(namespace = "", name = "fromDate", scope = ECPWaitDocStatus.class)
    public JAXBElement<XMLGregorianCalendar> createECPWaitDocStatusToDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ECPWaitDocStatusToDate_QNAME, XMLGregorianCalendar.class, ECPWaitDocStatus.class, value);
    }

}
