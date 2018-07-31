package com.netease.anomonitor.service.impl;

import com.alibaba.druid.pool.DruidDataSource;
import com.netease.anomonitor.entity.conn.DBConn;
import com.netease.anomonitor.entity.dataSource.DataSourceFactory;
import com.netease.anomonitor.entity.dataSource.DynamicDataSourceDelegate;
import com.netease.anomonitor.mapper.DataSourceMapper;
import com.netease.anomonitor.entity.dataSource.DataSourceContextHolder;
import com.netease.anomonitor.entity.dataSource.DynamicDataSource;
import com.netease.anomonitor.service.DataSourceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class DataSourceServiceImpl implements DataSourceService {
    private final Logger logger = LoggerFactory.getLogger(DataSourceServiceImpl.class);

    @Autowired
    private DataSourceMapper dataSourceMapper;

    public List<String> getTableNames(DBConn conn) {
        DruidDataSource dataSource = DataSourceFactory.getInstance().newDataSource(conn);
        Map<Object, Object> dataSourceMap = DynamicDataSource.getInstance().getDataSourceMap();
        String dataSourceName = DynamicDataSourceDelegate.generateDataSourceName(conn.getDbName());
        dataSourceMap.put(dataSourceName, dataSource);
        DynamicDataSource.getInstance().setTargetDataSources(dataSourceMap);
        DataSourceContextHolder.setDBType(dataSourceName);
        List<Map> tableList = dataSourceMapper.listTables();
        logger.info("Database name = {}, table size = {}", conn.getDbName(), tableList.size());
        List<String> tableNameList = new ArrayList<>();
        for (int i = 0; i < tableList.size(); i++) {
            Map tableMap = tableList.get(i);
            String tableName = (String) tableMap.get(DynamicDataSourceDelegate.TABLE_NAME);
            tableNameList.add(tableName);
        }
        return tableNameList;
    }

    @Override
    public List<String> getTableColumns(String tableName) {
        return null;
    }


    public boolean tryDBConn() {
        return false;
    }

}
