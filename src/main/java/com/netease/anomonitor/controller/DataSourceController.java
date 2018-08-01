package com.netease.anomonitor.controller;

import com.netease.anomonitor.dto.TableColumn;
import com.netease.anomonitor.entity.conn.DBConn;
import com.netease.anomonitor.entity.response.ResponseContent;
import com.netease.anomonitor.service.DataSourceService;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/dataSource")
public class DataSourceController {
    private final Logger logger = LoggerFactory.getLogger(DataSourceController.class);

    @Autowired
    private DataSourceService dataSourceService;

    @ApiOperation(value = "获取数据库连接，对应的所有表", notes = "根据连接信息获取数据库连接，对应的所有表")
    @RequestMapping(value = "/listTables", method = RequestMethod.POST)
    public ResponseContent<List<String>> listTableNames(@RequestBody DBConn conn) {
        logger.info("Get table name list from db {}", conn.getDbName());
        try {
            List<String> tableNames = dataSourceService.getTableNames(conn);
            return new ResponseContent<>(true, tableNames, "");
        } catch (Exception e) {
            logger.info("Connection timed out: {}", e.toString());
            return new ResponseContent<>(false, null, "Connection timed out");
        }
    }

    @ApiOperation(value = "获取数据库中的表", notes = "根据表名和数据库名获取表描述")
    @RequestMapping(value = "/listColumns", method = RequestMethod.POST)
    public ResponseContent<List<TableColumn>> listTableColumn(@RequestBody DBConn conn) {
        logger.info("Get table columns list from table {}", conn.getTableName());
        try {
            List<TableColumn> tableColumns = dataSourceService.getTableColumns(conn);
            return new ResponseContent<>(false, tableColumns, "");
        } catch (Exception e) {
            logger.info("Connection timed out: {}", e.toString());
            return new ResponseContent<>(false, null, e.toString());
        }
    }

}
