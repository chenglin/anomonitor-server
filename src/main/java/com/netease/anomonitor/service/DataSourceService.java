package com.netease.anomonitor.service;

import com.netease.anomonitor.dto.TableColumn;
import com.netease.anomonitor.entity.DataSource;

import java.util.List;

public interface DataSourceService {

    Integer addDataSource(DataSource ds) throws Exception;

    List<String> listTables(Integer id) throws Exception;

    List<TableColumn> listTableColumns(Integer id, String schemaName) throws Exception;

    DataSource getDataSourceById(Integer id);
}
