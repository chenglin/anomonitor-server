package com.netease.anomonitor.dto;

public class TableData {
    private String tableName;
    private String tableType;

    public TableData() {

    }

    public TableData(String tableName, String tableType) {
        this();
        this.tableName = tableName;
        this.tableType = tableType;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getTableType() {
        return tableType;
    }

    public void setTableType(String tableType) {
        this.tableType = tableType;
    }
}
