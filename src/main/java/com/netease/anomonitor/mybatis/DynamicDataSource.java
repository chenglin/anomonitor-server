package com.netease.anomonitor.mybatis;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import java.util.HashMap;
import java.util.Map;

public class DynamicDataSource extends AbstractRoutingDataSource {

    private volatile static DynamicDataSource instance;

    private static byte[] lock = new byte[0];

    private static Map<Object, Object> dataSourceMap = new HashMap<>();

    public static synchronized DynamicDataSource getInstance() {
        if (instance == null) {
            synchronized (lock) {
                if (instance == null) {
                    instance = new DynamicDataSource();
                }
            }
        }
        return instance;
    }

    public Map<Object, Object> getDataSourceMap() {
        return dataSourceMap;
    }

    @Override
    public void setTargetDataSources(Map<Object, Object> targetDataSources) {
        super.setTargetDataSources(targetDataSources);
        dataSourceMap.putAll(targetDataSources);
        super.afterPropertiesSet();
    }

    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceContextHolder.getDBType();
    }

}
