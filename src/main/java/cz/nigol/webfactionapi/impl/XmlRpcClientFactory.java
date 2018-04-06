package cz.nigol.webfactionapi.impl;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

public class XmlRpcClientFactory {
    private String url;
    private XmlRpcClient xmlRpcClient;

    /**
     * Manually created instances are not allowed.
     */
    private XmlRpcClientFactory() {
    }
    
    private XmlRpcClientFactory(String url, XmlRpcClient client) {
        this.url = url;
        this.xmlRpcClient = client;
    }

    /**
     * Prepare XmlRpcClientFactory instance.
     * @param url
     * @return 
     * @throws MalformedURLException
     */
    public static XmlRpcClientFactory of(String url) throws MalformedURLException {
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL(url));
        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);
        return new XmlRpcClientFactory(url, client);
    }

    /**
     * @return the xmlRpcClient
     */
    public XmlRpcClient getXmlRpcClient() {
        return xmlRpcClient;
    }
}
