package com.netease.anomonitor.entity.conn;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.netease.anomonitor.entity.enu.DBType;

import java.io.Serializable;

public class DBConn implements Serializable {
    @JsonIgnoreProperties
    private Long id;
    private String dbName;
    private String dbIp;
    private String dbPort;
    private String dbUser;
    private String dbPasswd;
    private String url;
    private DBType dbType;

    public DBConn() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getDbPort() {
        return dbPort;
    }

    public void setDbPort(String dbPort) {
        this.dbPort = dbPort;
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

    public DBType getDbType() {
        return dbType;
    }

    public void setDbType(DBType dbType) {
        this.dbType = dbType;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "DBConn{" +
                "id=" + id +
                ", dbName='" + dbName + '\'' +
                ", dbIp='" + dbIp + '\'' +
                ", dbPort='" + dbPort + '\'' +
                ", dbUser='" + dbUser + '\'' +
                ", dbPasswd='" + dbPasswd + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
