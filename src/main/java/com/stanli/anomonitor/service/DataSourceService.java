package com.stanli.anomonitor.service;

import com.stanli.anomonitor.dto.TableColumn;
import com.stanli.anomonitor.entity.conn.DBConn;

import java.util.List;

public interface DataSourceService {

    public List<String> getTableNames(DBConn conn) throws Exception;

    public List<TableColumn> getTableColumns(DBConn conn) throws Exception;

}
