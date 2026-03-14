
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

    private static final QName _GetMenu_QNAME = new QName("http://winery.fiap.com.br/", "getMenu");
    private static final QName _GetMenuResponse_QNAME = new QName("http://winery.fiap.com.br/", "getMenuResponse");
    private static final QName _PlaceOrder_QNAME = new QName("http://winery.fiap.com.br/", "placeOrder");
    private static final QName _PlaceOrderResponse_QNAME = new QName("http://winery.fiap.com.br/", "placeOrderResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.fiap.winery.stubclasses
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetMenu }
     * 
     * @return
     *     the new instance of {@link GetMenu }
     */
    public GetMenu createGetMenu() {
        return new GetMenu();
    }

    /**
     * Create an instance of {@link GetMenuResponse }
     * 
     * @return
     *     the new instance of {@link GetMenuResponse }
     */
    public GetMenuResponse createGetMenuResponse() {
        return new GetMenuResponse();
    }

    /**
     * Create an instance of {@link PlaceOrder }
     * 
     * @return
     *     the new instance of {@link PlaceOrder }
     */
    public PlaceOrder createPlaceOrder() {
        return new PlaceOrder();
    }

    /**
     * Create an instance of {@link PlaceOrderResponse }
     * 
     * @return
     *     the new instance of {@link PlaceOrderResponse }
     */
    public PlaceOrderResponse createPlaceOrderResponse() {
        return new PlaceOrderResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMenu }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetMenu }{@code >}
     */
    @XmlElementDecl(namespace = "http://winery.fiap.com.br/", name = "getMenu")
    public JAXBElement<GetMenu> createGetMenu(GetMenu value) {
        return new JAXBElement<>(_GetMenu_QNAME, GetMenu.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMenuResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetMenuResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://winery.fiap.com.br/", name = "getMenuResponse")
    public JAXBElement<GetMenuResponse> createGetMenuResponse(GetMenuResponse value) {
        return new JAXBElement<>(_GetMenuResponse_QNAME, GetMenuResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlaceOrder }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PlaceOrder }{@code >}
     */
    @XmlElementDecl(namespace = "http://winery.fiap.com.br/", name = "placeOrder")
    public JAXBElement<PlaceOrder> createPlaceOrder(PlaceOrder value) {
        return new JAXBElement<>(_PlaceOrder_QNAME, PlaceOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlaceOrderResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PlaceOrderResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://winery.fiap.com.br/", name = "placeOrderResponse")
    public JAXBElement<PlaceOrderResponse> createPlaceOrderResponse(PlaceOrderResponse value) {
        return new JAXBElement<>(_PlaceOrderResponse_QNAME, PlaceOrderResponse.class, null, value);
    }

}
