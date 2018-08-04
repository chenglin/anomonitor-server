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
    public Integer addDataSource(DataSource ds) throws Exception {
        DynamicDataSourceDelegate.setDataSource(ds);
        List<Map> tables = dataSourceMapper.listTables();
        logger.info("Connected data source, table size = {}", tables.size());
        DataSourceContextHolder.setDBType("default");
        logger.info("Reconnected default data source");
        return dataSourceMapper.insertOne(ds);
    }

    @Override
    public List<String> listTables(Integer id) throws Exception {
        DataSource ds = dataSourceMapper.getById(id);
        DynamicDataSourceDelegate.setDataSource(ds);
        List<Map> tableList = dataSourceMapper.listTables();
        logger.info("Database name = {}, table size = {}", ds.getDbName(), tableList.size());
        return DynamicDataSourceDelegate.getTableDescValues(tableList);
    }

    @Override
    public List<TableColumn> listTableColumns(Integer id, String schemaName) throws Exception {
        DataSource ds = dataSourceMapper.getById(id);
        DynamicDataSourceDelegate.setDataSource(ds);
        List<Map> columnDesc = dataSourceMapper.listTableColumns(schemaName);
        logger.info("Database name = {}, table size = {}", ds.getDbName(), columnDesc.size());
        return DynamicDataSourceDelegate.getTableColumnDescValue(columnDesc);
    }

    @Override
    public DataSource getDataSourceById(Integer id) {
        return dataSourceMapper.getById(id);
    }

}
