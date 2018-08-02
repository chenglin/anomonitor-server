package com.stanli.anomonitor.service;


import com.stanli.anomonitor.entity.conn.DBConn;

import java.util.List;

public interface DBConnService {

    List<DBConn> getAllConn();

    DBConn getConnById(Long id);

    void deleteById(Long id);

    void addOne(DBConn conn);

    void isExist(String url);

}
