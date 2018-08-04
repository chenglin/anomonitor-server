package com.stanli.anomonitor.service;

import com.stanli.anomonitor.dto.TableColumn;
import com.stanli.anomonitor.entity.DataSource;

import java.util.List;

public interface DataSourceService {

    DataSource addDataSource(DataSource ds) throws Exception;

    List<String> listTables(Long id) throws Exception;

    List<TableColumn> listTableColumns(Long id, String schemaName) throws Exception;

}
