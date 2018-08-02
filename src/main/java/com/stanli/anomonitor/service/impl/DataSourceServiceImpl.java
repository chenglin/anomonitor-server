package com.stanli.anomonitor.service.impl;

import com.stanli.anomonitor.dto.TableColumn;
import com.stanli.anomonitor.entity.conn.DBConn;
import com.stanli.anomonitor.db.DynamicDataSourceDelegate;
import com.stanli.anomonitor.mapper.DataSourceMapper;
import com.stanli.anomonitor.service.DBConnService;
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

    @Autowired
    private DBConnService dbConnService;

    public List<String> getTableNames(DBConn conn) throws Exception {
        DynamicDataSourceDelegate.setDataSource(conn);
        List<Map> tableList = dataSourceMapper.listTables();
        logger.info("Database name = {}, table size = {}", conn.getDbName(), tableList.size());
        conn.setUrl(DynamicDataSourceDelegate.generateMySQLUrl(conn));
        return DynamicDataSourceDelegate.getTableDescValues(tableList);
    }

    @Override
    public List<TableColumn> getTableColumns(DBConn conn) throws Exception {
        DynamicDataSourceDelegate.setDataSource(conn);
        logger.info("DB name = {}, Table name = {}", conn.getDbName(), conn.getTableName());
        List<Map> columns = dataSourceMapper.listTableColumns(conn.getTableName());
        return DynamicDataSourceDelegate.getTableColumnDescValue(columns);
    }


}
