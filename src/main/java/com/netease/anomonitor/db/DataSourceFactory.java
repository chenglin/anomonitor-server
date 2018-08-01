package com.netease.anomonitor.db;


import com.alibaba.druid.pool.DruidDataSource;
import com.netease.anomonitor.entity.conn.DBConn;

public class DataSourceFactory {

    private static final String DRIVER_CLASS_NAME = "com.mysql.jdbc.Driver";

    private volatile static DataSourceFactory instance;

    private static byte[] lock = new byte[0];

    private DataSourceFactory() {

    }

    public static synchronized DataSourceFactory getInstance() {
        if (instance == null) {
            synchronized (lock) {
                if (instance == null) {
                    instance = new DataSourceFactory();
                }
            }
        }
        return instance;
    }

    public static DruidDataSource newDataSource(DBConn conn) {
        DruidDataSource dynamicDataSource = new DruidDataSource();
        dynamicDataSource.setDriverClassName(DRIVER_CLASS_NAME);
        dynamicDataSource.setUrl("jdbc:mysql://" + conn.getDbIp() + ":" + conn.getDbPort() + "/" + conn.getDbName() + "?characterEncoding=utf-8&zeroDateTimeBehavior=convertToNull");
        dynamicDataSource.setUsername(conn.getDbUser());
        dynamicDataSource.setPassword(conn.getDbPasswd());
        return dynamicDataSource;
    }

}
