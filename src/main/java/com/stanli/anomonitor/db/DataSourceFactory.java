package com.stanli.anomonitor.db;


import com.alibaba.druid.pool.DruidDataSource;
import com.stanli.anomonitor.entity.DataSource;

public class DataSourceFactory {

    private static final String DRIVER_CLASS_NAME = "com.mysql.jdbc.Driver";

    private static final int MAX_WAIT_TIME = 5000;

    private volatile static DataSourceFactory instance;

    private static byte[] lock = new byte[0];

    private final static String MYSQL = "mysql";

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

    public static DruidDataSource newDataSource(DataSource ds) {
        DruidDataSource dynamicDataSource = new DruidDataSource();
        dynamicDataSource.setDriverClassName(DRIVER_CLASS_NAME);
        dynamicDataSource.setUrl(DynamicDataSourceDelegate.generateMySQLUrl(ds));
        dynamicDataSource.setUsername(ds.getDbUser());
        dynamicDataSource.setPassword(ds.getDbPasswd());
        dynamicDataSource.setMaxWait(MAX_WAIT_TIME);
        return dynamicDataSource;
    }

}
