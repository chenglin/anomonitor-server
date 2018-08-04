package com.stanli.anomonitor.entity;

import com.stanli.anomonitor.entity.conn.DBConn;

public class TableData {
    private Long id;
    // many to one
    private DBConn dbConn;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DBConn getDbConn() {
        return dbConn;
    }

    public void setDbConn(DBConn dbConn) {
        this.dbConn = dbConn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TableData{" +
                "id=" + id +
                ", dbConn=" + dbConn +
                ", name='" + name + '\'' +
                '}';
    }
}
