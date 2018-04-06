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
    public WebFactionSession setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
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
    public WebFactionSession setXmlRpcClientFactory(XmlRpcClientFactory xmlRpcClientFactory) {
        this.xmlRpcClientFactory = xmlRpcClientFactory;
        return this;
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
    public WebFactionSession setUsername(String username) {
        this.username = username;
        return this;
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
    public WebFactionSession setWebServer(String webServer) {
        this.webServer = webServer;
        return this;
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
    public WebFactionSession setVersion(int version) {
        this.version = version;
        return this;
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
    public WebFactionSession setHome(String home) {
        this.home = home;
        return this;
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
    public WebFactionSession setMailServer(String mailServer) {
        this.mailServer = mailServer;
        return this;
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
    public WebFactionSession setId(int id) {
        this.id = id;
        return this;
    }
}
