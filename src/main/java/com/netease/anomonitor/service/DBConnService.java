package com.netease.anomonitor.service;


import com.netease.anomonitor.entity.conn.DBConn;

import java.util.List;

public interface DBConnService {

    List<DBConn> getAllConn();

}
