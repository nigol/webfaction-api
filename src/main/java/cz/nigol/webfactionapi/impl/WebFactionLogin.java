package cz.nigol.webfactionapi.impl;

import java.util.Map;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;

import cz.nigol.webfactionapi.model.WebFactionSession;

/**
 * Login to the WebFaction API.
 */
public class WebFactionLogin {

    /**
     * Login to the WebFaction API.
     * @param clientFactory instance of XmlRpcClientFactory
     * @param username      username for your account
     * @param password      password account
     * @param serverName    server name capitalized (for example 'Web999')
     * @return
     * @throws XmlRpcException
     */
    public WebFactionSession login(XmlRpcClientFactory clientFactory, String username, String password,
            String serverName) throws XmlRpcException {
        XmlRpcClient client = clientFactory.getXmlRpcClient();
        Object[] params = new Object[]{username, password, serverName};
        Object[] result = (Object[]) client.execute("login", params);
        return prepareSessionInstance(result);
    }

    private WebFactionSession prepareSessionInstance(Object[] response) {
        WebFactionSession session = new WebFactionSession();
        @SuppressWarnings("unchecked")
        Map<String, Object> map = (Map<String, Object>) response[1];
        session.setSessionId((String) response[0])
            .setUsername((String) map.get("username"))
            .setWebServer((String) map.get("web_server"))
            .setVersion((Integer) map.get("version"))
            .setHome((String) map.get("home"))
            .setMailServer((String) map.get("mail_server"))
            .setId((Integer) map.get("id"));
        return session;
    }
}
