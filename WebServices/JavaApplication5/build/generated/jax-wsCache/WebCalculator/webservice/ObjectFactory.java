
package webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservice package. 
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

    private final static QName _GetDeegResponse_QNAME = new QName("http://webService/", "getDeegResponse");
    private final static QName _GetKaas_QNAME = new QName("http://webService/", "getKaas");
    private final static QName _CombineWebPizzaResponse_QNAME = new QName("http://webService/", "combineWebPizzaResponse");
    private final static QName _GetGroentenResponse_QNAME = new QName("http://webService/", "getGroentenResponse");
    private final static QName _GetKookTijd_QNAME = new QName("http://webService/", "getKookTijd");
    private final static QName _GetSausResponse_QNAME = new QName("http://webService/", "getSausResponse");
    private final static QName _GetDeeg_QNAME = new QName("http://webService/", "getDeeg");
    private final static QName _GetSaus_QNAME = new QName("http://webService/", "getSaus");
    private final static QName _AddGroentenResponse_QNAME = new QName("http://webService/", "addGroentenResponse");
    private final static QName _GetGroenten_QNAME = new QName("http://webService/", "getGroenten");
    private final static QName _GetKaasResponse_QNAME = new QName("http://webService/", "getKaasResponse");
    private final static QName _CombineWebPizza_QNAME = new QName("http://webService/", "combineWebPizza");
    private final static QName _GetKookTijdResponse_QNAME = new QName("http://webService/", "getKookTijdResponse");
    private final static QName _AddGroenten_QNAME = new QName("http://webService/", "addGroenten");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetGroenten }
     * 
     */
    public GetGroenten createGetGroenten() {
        return new GetGroenten();
    }

    /**
     * Create an instance of {@link GetKaasResponse }
     * 
     */
    public GetKaasResponse createGetKaasResponse() {
        return new GetKaasResponse();
    }

    /**
     * Create an instance of {@link GetKookTijd }
     * 
     */
    public GetKookTijd createGetKookTijd() {
        return new GetKookTijd();
    }

    /**
     * Create an instance of {@link GetSausResponse }
     * 
     */
    public GetSausResponse createGetSausResponse() {
        return new GetSausResponse();
    }

    /**
     * Create an instance of {@link GetGroentenResponse }
     * 
     */
    public GetGroentenResponse createGetGroentenResponse() {
        return new GetGroentenResponse();
    }

    /**
     * Create an instance of {@link AddGroentenResponse }
     * 
     */
    public AddGroentenResponse createAddGroentenResponse() {
        return new AddGroentenResponse();
    }

    /**
     * Create an instance of {@link GetDeeg }
     * 
     */
    public GetDeeg createGetDeeg() {
        return new GetDeeg();
    }

    /**
     * Create an instance of {@link GetSaus }
     * 
     */
    public GetSaus createGetSaus() {
        return new GetSaus();
    }

    /**
     * Create an instance of {@link GetKookTijdResponse }
     * 
     */
    public GetKookTijdResponse createGetKookTijdResponse() {
        return new GetKookTijdResponse();
    }

    /**
     * Create an instance of {@link CombineWebPizza }
     * 
     */
    public CombineWebPizza createCombineWebPizza() {
        return new CombineWebPizza();
    }

    /**
     * Create an instance of {@link AddGroenten }
     * 
     */
    public AddGroenten createAddGroenten() {
        return new AddGroenten();
    }

    /**
     * Create an instance of {@link CombineWebPizzaResponse }
     * 
     */
    public CombineWebPizzaResponse createCombineWebPizzaResponse() {
        return new CombineWebPizzaResponse();
    }

    /**
     * Create an instance of {@link GetDeegResponse }
     * 
     */
    public GetDeegResponse createGetDeegResponse() {
        return new GetDeegResponse();
    }

    /**
     * Create an instance of {@link GetKaas }
     * 
     */
    public GetKaas createGetKaas() {
        return new GetKaas();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeegResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "getDeegResponse")
    public JAXBElement<GetDeegResponse> createGetDeegResponse(GetDeegResponse value) {
        return new JAXBElement<GetDeegResponse>(_GetDeegResponse_QNAME, GetDeegResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetKaas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "getKaas")
    public JAXBElement<GetKaas> createGetKaas(GetKaas value) {
        return new JAXBElement<GetKaas>(_GetKaas_QNAME, GetKaas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CombineWebPizzaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "combineWebPizzaResponse")
    public JAXBElement<CombineWebPizzaResponse> createCombineWebPizzaResponse(CombineWebPizzaResponse value) {
        return new JAXBElement<CombineWebPizzaResponse>(_CombineWebPizzaResponse_QNAME, CombineWebPizzaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGroentenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "getGroentenResponse")
    public JAXBElement<GetGroentenResponse> createGetGroentenResponse(GetGroentenResponse value) {
        return new JAXBElement<GetGroentenResponse>(_GetGroentenResponse_QNAME, GetGroentenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetKookTijd }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "getKookTijd")
    public JAXBElement<GetKookTijd> createGetKookTijd(GetKookTijd value) {
        return new JAXBElement<GetKookTijd>(_GetKookTijd_QNAME, GetKookTijd.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSausResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "getSausResponse")
    public JAXBElement<GetSausResponse> createGetSausResponse(GetSausResponse value) {
        return new JAXBElement<GetSausResponse>(_GetSausResponse_QNAME, GetSausResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeeg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "getDeeg")
    public JAXBElement<GetDeeg> createGetDeeg(GetDeeg value) {
        return new JAXBElement<GetDeeg>(_GetDeeg_QNAME, GetDeeg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSaus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "getSaus")
    public JAXBElement<GetSaus> createGetSaus(GetSaus value) {
        return new JAXBElement<GetSaus>(_GetSaus_QNAME, GetSaus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddGroentenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "addGroentenResponse")
    public JAXBElement<AddGroentenResponse> createAddGroentenResponse(AddGroentenResponse value) {
        return new JAXBElement<AddGroentenResponse>(_AddGroentenResponse_QNAME, AddGroentenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGroenten }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "getGroenten")
    public JAXBElement<GetGroenten> createGetGroenten(GetGroenten value) {
        return new JAXBElement<GetGroenten>(_GetGroenten_QNAME, GetGroenten.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetKaasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "getKaasResponse")
    public JAXBElement<GetKaasResponse> createGetKaasResponse(GetKaasResponse value) {
        return new JAXBElement<GetKaasResponse>(_GetKaasResponse_QNAME, GetKaasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CombineWebPizza }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "combineWebPizza")
    public JAXBElement<CombineWebPizza> createCombineWebPizza(CombineWebPizza value) {
        return new JAXBElement<CombineWebPizza>(_CombineWebPizza_QNAME, CombineWebPizza.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetKookTijdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "getKookTijdResponse")
    public JAXBElement<GetKookTijdResponse> createGetKookTijdResponse(GetKookTijdResponse value) {
        return new JAXBElement<GetKookTijdResponse>(_GetKookTijdResponse_QNAME, GetKookTijdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddGroenten }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "addGroenten")
    public JAXBElement<AddGroenten> createAddGroenten(AddGroenten value) {
        return new JAXBElement<AddGroenten>(_AddGroenten_QNAME, AddGroenten.class, null, value);
    }

}
