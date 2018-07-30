package com.netease.anomonitor.service;

import java.util.List;

public interface DataSourceService {

    public List<String> getTableNames();

    public boolean tryDBConn();
}
