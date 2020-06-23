
package daoc.soapclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the daoc.soapclient package. 
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

    private final static QName _GetAllEmpleados_QNAME = new QName("http://soapjaxws.daoc/", "getAllEmpleados");
    private final static QName _GetAllEmpleadosResponse_QNAME = new QName("http://soapjaxws.daoc/", "getAllEmpleadosResponse");
    private final static QName _GetEmpleado_QNAME = new QName("http://soapjaxws.daoc/", "getEmpleado");
    private final static QName _GetEmpleadoResponse_QNAME = new QName("http://soapjaxws.daoc/", "getEmpleadoResponse");
    private final static QName _CreateEmpleadoResponse_QNAME = new QName("http://soapjaxws.daoc/", "createEmpleadoResponse");
    private final static QName _CreateEmpleado_QNAME = new QName("http://soapjaxws.daoc/", "createEmpleado");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: daoc.soapclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllEmpleados }
     * 
     */
    public GetAllEmpleados createGetAllEmpleados() {
        return new GetAllEmpleados();
    }

    /**
     * Create an instance of {@link GetAllEmpleadosResponse }
     * 
     */
    public GetAllEmpleadosResponse createGetAllEmpleadosResponse() {
        return new GetAllEmpleadosResponse();
    }

    /**
     * Create an instance of {@link GetEmpleado }
     * 
     */
    public GetEmpleado createGetEmpleado() {
        return new GetEmpleado();
    }

    /**
     * Create an instance of {@link GetEmpleadoResponse }
     * 
     */
    public GetEmpleadoResponse createGetEmpleadoResponse() {
        return new GetEmpleadoResponse();
    }

    /**
     * Create an instance of {@link CreateEmpleadoResponse }
     * 
     */
    public CreateEmpleadoResponse createCreateEmpleadoResponse() {
        return new CreateEmpleadoResponse();
    }

    /**
     * Create an instance of {@link CreateEmpleado }
     * 
     */
    public CreateEmpleado createCreateEmpleado() {
        return new CreateEmpleado();
    }

    /**
     * Create an instance of {@link Empleado }
     * 
     */
    public Empleado createEmpleado() {
        return new Empleado();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllEmpleados }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapjaxws.daoc/", name = "getAllEmpleados")
    public JAXBElement<GetAllEmpleados> createGetAllEmpleados(GetAllEmpleados value) {
        return new JAXBElement<GetAllEmpleados>(_GetAllEmpleados_QNAME, GetAllEmpleados.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllEmpleadosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapjaxws.daoc/", name = "getAllEmpleadosResponse")
    public JAXBElement<GetAllEmpleadosResponse> createGetAllEmpleadosResponse(GetAllEmpleadosResponse value) {
        return new JAXBElement<GetAllEmpleadosResponse>(_GetAllEmpleadosResponse_QNAME, GetAllEmpleadosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmpleado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapjaxws.daoc/", name = "getEmpleado")
    public JAXBElement<GetEmpleado> createGetEmpleado(GetEmpleado value) {
        return new JAXBElement<GetEmpleado>(_GetEmpleado_QNAME, GetEmpleado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmpleadoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapjaxws.daoc/", name = "getEmpleadoResponse")
    public JAXBElement<GetEmpleadoResponse> createGetEmpleadoResponse(GetEmpleadoResponse value) {
        return new JAXBElement<GetEmpleadoResponse>(_GetEmpleadoResponse_QNAME, GetEmpleadoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateEmpleadoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapjaxws.daoc/", name = "createEmpleadoResponse")
    public JAXBElement<CreateEmpleadoResponse> createCreateEmpleadoResponse(CreateEmpleadoResponse value) {
        return new JAXBElement<CreateEmpleadoResponse>(_CreateEmpleadoResponse_QNAME, CreateEmpleadoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateEmpleado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapjaxws.daoc/", name = "createEmpleado")
    public JAXBElement<CreateEmpleado> createCreateEmpleado(CreateEmpleado value) {
        return new JAXBElement<CreateEmpleado>(_CreateEmpleado_QNAME, CreateEmpleado.class, null, value);
    }

}
