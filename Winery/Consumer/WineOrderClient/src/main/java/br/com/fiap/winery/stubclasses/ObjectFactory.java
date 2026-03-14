
package br.com.fiap.winery.stubclasses;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.fiap.winery.stubclasses package. 
 * <p>An ObjectFactory allows you to programmatically 
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

    private static final QName _SendWarn_QNAME = new QName("http://winery.fiap.com.br/", "sendWarn");
    private static final QName _SendWarnResponse_QNAME = new QName("http://winery.fiap.com.br/", "sendWarnResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.fiap.winery.stubclasses
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SendWarn }
     * 
     * @return
     *     the new instance of {@link SendWarn }
     */
    public SendWarn createSendWarn() {
        return new SendWarn();
    }

    /**
     * Create an instance of {@link SendWarnResponse }
     * 
     * @return
     *     the new instance of {@link SendWarnResponse }
     */
    public SendWarnResponse createSendWarnResponse() {
        return new SendWarnResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendWarn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendWarn }{@code >}
     */
    @XmlElementDecl(namespace = "http://winery.fiap.com.br/", name = "sendWarn")
    public JAXBElement<SendWarn> createSendWarn(SendWarn value) {
        return new JAXBElement<>(_SendWarn_QNAME, SendWarn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendWarnResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendWarnResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://winery.fiap.com.br/", name = "sendWarnResponse")
    public JAXBElement<SendWarnResponse> createSendWarnResponse(SendWarnResponse value) {
        return new JAXBElement<>(_SendWarnResponse_QNAME, SendWarnResponse.class, null, value);
    }

}
