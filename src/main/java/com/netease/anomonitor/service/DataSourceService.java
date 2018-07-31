package com.netease.anomonitor.service;

import com.netease.anomonitor.entity.conn.DBConn;

import java.util.List;

public interface DataSourceService {

    public List<String> getTableNames(DBConn dbInfo);

    public List<String> getTableColumns(String tableName);

    public boolean tryDBConn();
}
