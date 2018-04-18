package cz.nigol.webfactionapi.impl;

import org.apache.xmlrpc.client.XmlRpcClient;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import cz.nigol.webfactionapi.model.DiskUsageInfo;
import cz.nigol.webfactionapi.model.WebFactionSession;

import static org.mockito.Mockito.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class WebFactionGeneralTest {
    @Mock
    private XmlRpcClientFactory clientFactory;
    @Mock
    private XmlRpcClient client;
    @Mock
    private WebFactionSession session;
    private WebFactionGeneral webFactionGeneral;

    @Before
    public void init() {
        WebFactionGeneral general = new WebFactionGeneral();
    }

    @Test
    public void testListDiskUsage() throws Exception {
        Map<String, Object> result = new HashMap<String, Object>();
        when(clientFactory.getXmlRpcClient()).thenReturn(client);
        when(session.getXmlRpcClientFactory()).thenReturn(clientFactory);
        when(session.getSessionId()).thenReturn("id");
        when(client.execute(eq("list_disk_usage"), any(List.class))).thenReturn(result);
    }
}
