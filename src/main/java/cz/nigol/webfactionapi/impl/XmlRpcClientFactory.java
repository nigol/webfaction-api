package cz.nigol.webfactionapi.impl;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

public class XmlRpcClientFactory {
    private String url;

    /**
     * Manually created instances are not allowed.
     */
    private XmlRpcClientFactory() {
    }
    
    private XmlRpcClientFactory(String url) {
        this.url = url;
    }

    public static XmlRpcClientFactory of(String url) {
        return new XmlRpcClientFactory(url);
    }

    /**
     * Get XmlRpcClient based on URL.
     * @return client
     * @throws MalformedURLException
     */
    public XmlRpcClient getXmlRpcClient() throws MalformedURLException {
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL(url));
        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);
        return client;
    }
}
