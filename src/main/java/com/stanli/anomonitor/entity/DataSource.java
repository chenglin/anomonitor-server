package com.stanli.anomonitor.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class DataSource {
    @JsonIgnore
    private Integer id;
    private String dbName;
    private String dbIp;
    private String dbPort;
    private String dbUser;
    private String dbPasswd;

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getDbIp() {
        return dbIp;
    }

    public void setDbIp(String dbIp) {
        this.dbIp = dbIp;
    }

    public String getDbUser() {
        return dbUser;
    }

    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }

    public String getDbPasswd() {
        return dbPasswd;
    }

    public void setDbPasswd(String dbPasswd) {
        this.dbPasswd = dbPasswd;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDbPort() {
        return dbPort;
    }

    public void setDbPort(String dbPort) {
        this.dbPort = dbPort;
    }
}
