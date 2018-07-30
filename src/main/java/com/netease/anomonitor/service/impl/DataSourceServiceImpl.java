package com.netease.anomonitor.service.impl;

import com.netease.anomonitor.service.DataSourceService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DataSourceServiceImpl implements DataSourceService {


    public List<String> getTableNames() {
        return new ArrayList<>();
    }

    public boolean tryDBConn() {
        return false;
    }

}
