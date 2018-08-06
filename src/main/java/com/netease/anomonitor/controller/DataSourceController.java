package com.netease.anomonitor.controller;

import com.netease.anomonitor.dto.TableData;
import com.netease.anomonitor.entity.DataSource;
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
@RequestMapping(value = "/data-source/mysql")
public class DataSourceController {
    private final Logger logger = LoggerFactory.getLogger(DataSourceController.class);

    @Autowired
    private DataSourceService dataSourceService;

    @ApiOperation(value = "")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseContent<Integer> addDataSource(
            @RequestBody DataSource dataSource) {
        try {
            Integer dsId = dataSourceService.addDataSource(dataSource);
            return new ResponseContent<>(true, dsId, "");
        } catch (Exception e) {
            return new ResponseContent<>(false, null, "");
        }
    }

    @ApiOperation(value = "获取数据库连接，对应的所有表", notes = "根据连接信息获取数据库连接，对应的所有表")
    @RequestMapping(value = "/list-tables", method = RequestMethod.GET)
    public ResponseContent<List<String>> listTables(@RequestParam Integer dsId) {
        try {
            List<String> tableNames = dataSourceService.listTables(dsId);
            return new ResponseContent<>(true, tableNames, "");
        } catch (Exception e) {
            logger.info("Connection timed out: {}", e.toString());
            return new ResponseContent<>(false, null, "Connection timed out");
        }
    }


    @ApiOperation(value = "获取数据库中的表", notes = "根据表名和数据库名获取表描述")
    @RequestMapping(value = "/list-table-columns", method = RequestMethod.GET)
    public ResponseContent<List<TableData>> listTableColumn(@RequestParam Integer dsId,
                                                            @RequestParam String schemaName) {
        try {
            List<TableData> tableColumns = dataSourceService.listTableColumns(dsId, schemaName);
            return new ResponseContent<>(false, tableColumns, "");
        } catch (Exception e) {
            logger.info("Connection timed out: {}", e.toString());
            return new ResponseContent<>(false, null, e.toString());
        }
    }

}
