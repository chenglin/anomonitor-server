package com.netease.anomonitor.service;


import com.netease.anomonitor.entity.conn.DBConn;

import java.util.List;

public interface DBConnService {

    List<DBConn> getAllConn();

    DBConn getConnById(Long id);

    void deleteById(Long id);

    void addOne(DBConn conn);

    void isExist(String url);

}
