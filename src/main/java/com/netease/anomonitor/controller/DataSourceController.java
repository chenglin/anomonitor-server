package com.netease.anomonitor.controller;

import com.netease.anomonitor.entity.conn.DBConn;
import com.netease.anomonitor.entity.response.ResponseContent;
import com.netease.anomonitor.service.DataSourceService;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/dataSource")
public class DataSourceController {
    private final Logger logger = LoggerFactory.getLogger(DataSourceController.class);

    @Autowired
    private DataSourceService dataSourceService;


    @ApiOperation(value = "获取数据库连接，对应的所有表", notes = "根据连接信息获取数据库连接，对应的所有表")
    @RequestMapping(value = "/listTable", method = RequestMethod.POST)
    public ResponseContent<List<String>> listTableNames(DBConn dbConn) {
        logger.info("Get table name list from db {}", dbConn.getDbName());
        List<String> tableNames = dataSourceService.getTableNames(dbConn);
        return new ResponseContent<>(true, tableNames, "");
    }


    public void listTableColumn() {

    }

}
