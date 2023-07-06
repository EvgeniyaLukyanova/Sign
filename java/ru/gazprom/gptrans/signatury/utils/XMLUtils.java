package ru.gazpromtrans.utils;

import javax.xml.bind.*;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class XMLUtils {
    public static <T> JAXBElement<T> getJAXBObject(Class<T> clazz, String name, Object object) {
        JAXBElement<T> jaxbObject = new JAXBElement<>(new QName(name), clazz, clazz.cast(object));
        jaxbObject.setValue(clazz.cast(object));
        return jaxbObject;
    }

    /**
     * Получение XML-строки запроса из объекта
     */
    public static <T> String object2String(JAXBElement<?> getReferenceASU, Class<T> clazz) throws JAXBException {
        String xmlString;
        JAXBContext jaxbContext = JAXBContext.newInstance(clazz);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        StringWriter stringWriter = new StringWriter();
        marshaller.marshal(getReferenceASU, stringWriter);
        xmlString = stringWriter.toString();

        return xmlString;
    }

    /**
     * Преобразование строки в объект
     */
    public static <T> T string2Object(String stringContent, Class<T> clazz) throws JAXBException {
        stringContent = stringContent.replace(String.valueOf(Character.toChars(0)), "");
        JAXBContext jaxbContext = JAXBContext.newInstance(clazz);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        JAXBElement<?> result = (JAXBElement<?>) unmarshaller.unmarshal(new StringReader(stringContent));

        return clazz.cast(result.getValue());
    }

    /**
     * Преобразование строки в документ
     */
    public static Document string2XMLDoc(String response) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        InputSource inputSource = new InputSource();
        inputSource.setCharacterStream(new StringReader(response));

        return documentBuilder.parse(inputSource);
    }
}
