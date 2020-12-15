package com.github.cjcameron92.service.util;

public class DatabaseCredential {

    private String hostAddress;
    private int hostPort;
    private String hostUsername, hostPassword;
    private String driver = null;

    public DatabaseCredential(String hostAddress, int hostPort, String hostUsername, String hostPassword) {
        this.hostAddress = hostAddress;
        this.hostPort = hostPort;
        this.hostUsername = hostUsername;
        this.hostPassword = hostPassword;
    }

    public DatabaseCredential(String hostAddress, int hostPort, String hostUsername, String hostPassword, String driver) {
        this.hostAddress = hostAddress;
        this.hostPort = hostPort;
        this.hostUsername = hostUsername;
        this.hostPassword = hostPassword;
        this.driver = driver;
    }

    public String getHostAddress() {
        return hostAddress;
    }

    public int getHostPort() {
        return hostPort;
    }

    public String getHostUsername() {
        return hostUsername;
    }

    public String getHostPassword() {
        return hostPassword;
    }

    public String getDriver() {
        return driver;
    }
}
