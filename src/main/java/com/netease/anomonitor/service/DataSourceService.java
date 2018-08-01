package com.netease.anomonitor.service;

import com.netease.anomonitor.dto.TableColumn;
import com.netease.anomonitor.entity.conn.DBConn;

import java.util.List;

public interface DataSourceService {

    public List<String> getTableNames(DBConn conn) throws Exception;

    public List<TableColumn> getTableColumns(DBConn conn) throws Exception;

}
