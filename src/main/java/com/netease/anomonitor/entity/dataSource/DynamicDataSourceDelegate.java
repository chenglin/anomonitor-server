package com.netease.anomonitor.entity.dataSource;

public class DynamicDataSourceDelegate {

    public static final String TABLE_NAME = "TABLE_NAME";

    public static String generateDataSourceName(String dbName) {
        StringBuilder name = new StringBuilder();
        name.append("datasource");
        name.append("_");
        name.append(dbName);
        return name.toString();
    }
}
