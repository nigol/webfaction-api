package cz.nigol.webfactionapi.impl;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import cz.nigol.webfactionapi.model.WebFactionSession;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class WebFactionLoginTest {
    @Mock
    private XmlRpcClientFactory clientFactory;
    @Mock
    private XmlRpcClient client;
    private WebFactionLogin webFactionLogin;

    @Before
    public void init() {
        webFactionLogin = new WebFactionLogin();
    }

    @SuppressWarnings("unchecked")
    @Test
    public void testLogin() throws XmlRpcException {
        @SuppressWarnings("rawtypes")
        Map<String, Object> map = new HashMap();
        map.put("username", "1");
        map.put("web_server", "2");
        map.put("version", 3);
        map.put("home", "4");
        map.put("mail_server", "5");
        map.put("id", 6);
        Object[] result = new Object[]{"sessionId", map};
        when(clientFactory.getXmlRpcClient()).thenReturn(client);
        when(client.execute(eq("login"), any(List.class))).thenReturn(result);
        WebFactionSession session = webFactionLogin.login(clientFactory, "a", "b", "c");
        assertEquals("sessionId", session.getSessionId());
        assertEquals("1", session.getUsername());
        assertEquals("2", session.getWebServer());
        assertEquals(3, session.getVersion());
        assertEquals("4", session.getHome());
        assertEquals("5", session.getMailServer());
        assertEquals(6, session.getId());
        assertEquals(clientFactory, session.getXmlRpcClientFactory());
    }    
}
