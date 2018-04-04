package cz.nigol.webfactionapi.model;

import cz.nigol.webfactionapi.impl.XmlRpcClientFactory;

public class WebFactionSession {
    private String sessionId;
    private XmlRpcClientFactory xmlRpcClientFactory;
    private String username;
    private String webServer;
    private int version;
    private String home;
    private String mailServer;
    private int id;

    /**
     * @return the sessionId
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * @param sessionId the sessionId to set
     */
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * @return the xmlRpcClientFactory
     */
    public XmlRpcClientFactory getXmlRpcClientFactory() {
        return xmlRpcClientFactory;
    }

    /**
     * @param xmlRpcClientFactory the xmlRpcClientFactory to set
     */
    public void setXmlRpcClientFactory(XmlRpcClientFactory xmlRpcClientFactory) {
        this.xmlRpcClientFactory = xmlRpcClientFactory;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the webServer
     */
    public String getWebServer() {
        return webServer;
    }

    /**
     * @param webServer the webServer to set
     */
    public void setWebServer(String webServer) {
        this.webServer = webServer;
    }

    /**
     * @return the version
     */
    public int getVersion() {
        return version;
    }

    /**
     * @param version the version to set
     */
    public void setVersion(int version) {
        this.version = version;
    }

    /**
     * @return the home
     */
    public String getHome() {
        return home;
    }

    /**
     * @param home the home to set
     */
    public void setHome(String home) {
        this.home = home;
    }

    /**
     * @return the mailServer
     */
    public String getMailServer() {
        return mailServer;
    }

    /**
     * @param mailServer the mailServer to set
     */
    public void setMailServer(String mailServer) {
        this.mailServer = mailServer;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
}
