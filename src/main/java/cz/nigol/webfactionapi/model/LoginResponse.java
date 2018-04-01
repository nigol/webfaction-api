package cz.nigol.webfactionapi.model;

import java.io.Serializable;

public class LoginResponse implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String sessionId;
    private String id;
    private String username;
    private String home;
    private String webServer;
    private String mailServer;



    /**
     *
     */
    private LoginResponse() {
    }

    private LoginResponse(String sessionId, String id, String username, String home, String webServer, String mailServer) {
        this.sessionId = sessionId;
        this.id = id;
        this.username = username;
        this.home = home;
        this.webServer = webServer;
        this.mailServer = mailServer;
    }

    public static LoginResponse of(String sessionId, String id, String username, String home, String webServer, String mailServer) {
        return new LoginResponse(sessionId, id, username, home, webServer, mailServer);
    }

    /**
     * @return the sessionId
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @return the home
     */
    public String getHome() {
        return home;
    }

    /**
     * @return the webServer
     */
    public String getWebServer() {
        return webServer;
    }

    /**
     * @return the mailServer
     */
    public String getMailServer() {
        return mailServer;
    }
}
