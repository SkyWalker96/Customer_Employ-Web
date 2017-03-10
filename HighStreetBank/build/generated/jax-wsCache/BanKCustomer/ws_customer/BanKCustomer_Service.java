
package ws_customer;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "BanKCustomer", targetNamespace = "http://ws_customer/", wsdlLocation = "http://localhost:8080/WS_HighSteetBank/BanKCustomer?wsdl")
public class BanKCustomer_Service
    extends Service
{

    private final static URL BANKCUSTOMER_WSDL_LOCATION;
    private final static WebServiceException BANKCUSTOMER_EXCEPTION;
    private final static QName BANKCUSTOMER_QNAME = new QName("http://ws_customer/", "BanKCustomer");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/WS_HighSteetBank/BanKCustomer?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BANKCUSTOMER_WSDL_LOCATION = url;
        BANKCUSTOMER_EXCEPTION = e;
    }

    public BanKCustomer_Service() {
        super(__getWsdlLocation(), BANKCUSTOMER_QNAME);
    }

    public BanKCustomer_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), BANKCUSTOMER_QNAME, features);
    }

    public BanKCustomer_Service(URL wsdlLocation) {
        super(wsdlLocation, BANKCUSTOMER_QNAME);
    }

    public BanKCustomer_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BANKCUSTOMER_QNAME, features);
    }

    public BanKCustomer_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BanKCustomer_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BanKCustomer
     */
    @WebEndpoint(name = "BanKCustomerPort")
    public BanKCustomer getBanKCustomerPort() {
        return super.getPort(new QName("http://ws_customer/", "BanKCustomerPort"), BanKCustomer.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BanKCustomer
     */
    @WebEndpoint(name = "BanKCustomerPort")
    public BanKCustomer getBanKCustomerPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws_customer/", "BanKCustomerPort"), BanKCustomer.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BANKCUSTOMER_EXCEPTION!= null) {
            throw BANKCUSTOMER_EXCEPTION;
        }
        return BANKCUSTOMER_WSDL_LOCATION;
    }

}