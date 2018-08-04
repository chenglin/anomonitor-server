package com.stanli.anomonitor.service.impl;

import com.stanli.anomonitor.db.DataSourceContextHolder;
import com.stanli.anomonitor.dto.TableColumn;
import com.stanli.anomonitor.entity.DataSource;
import com.stanli.anomonitor.db.DynamicDataSourceDelegate;
import com.stanli.anomonitor.mapper.DataSourceMapper;
import com.stanli.anomonitor.service.DataSourceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DataSourceServiceImpl implements DataSourceService {
    private final Logger logger = LoggerFactory.getLogger(DataSourceServiceImpl.class);

    @Autowired
    private DataSourceMapper dataSourceMapper;

    @Override
    public DataSource addDataSource(DataSource ds) throws Exception {
        ds.setDbUrl(DynamicDataSourceDelegate.generateMySQLUrl(ds));
        DynamicDataSourceDelegate.setDataSource(ds);
        // check if data source is right
        List<Map> tables = dataSourceMapper.listTables();
        logger.info("Connected data source, table size = {}", tables.size());
        DataSourceContextHolder.setDBType("default");
        List<Map> tableList = dataSourceMapper.listTables();
        logger.info(" 2 Connected data source, table size = {}", tableList.size());
        dataSourceMapper.insertOne(ds);
        return dataSourceMapper.getByUrl(ds.getDbUrl());
    }

    @Override
    public List<String> listTables(Long id) throws Exception {
        DataSource ds = dataSourceMapper.getById(id);
        DynamicDataSourceDelegate.setDataSource(ds);
        List<Map> tableList = dataSourceMapper.listTables();
        logger.info("Database name = {}, table size = {}", ds.getDbName(), tableList.size());
        ds.setDbUrl(DynamicDataSourceDelegate.generateMySQLUrl(ds));
        return DynamicDataSourceDelegate.getTableDescValues(tableList);
    }

    @Override
    public List<TableColumn> listTableColumns(Long id, String schemaName) throws Exception {
        DataSource ds = dataSourceMapper.getById(id);
        DynamicDataSourceDelegate.setDataSource(ds);
        List<Map> columnDesc = dataSourceMapper.listTableColumns(schemaName);
        logger.info("Database name = {}, table size = {}", ds.getDbName(), columnDesc.size());
        ds.setDbUrl(DynamicDataSourceDelegate.generateMySQLUrl(ds));
        return DynamicDataSourceDelegate.getTableColumnDescValue(columnDesc);
    }

}
