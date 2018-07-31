package com.netease.anomonitor.service.impl;

import com.netease.anomonitor.entity.conn.DBConn;
import com.netease.anomonitor.mapper.DBConnMapper;
import com.netease.anomonitor.service.DBConnService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.List;

@Service
public class DBConnServiceImpl implements DBConnService {
    private final Logger logger = LoggerFactory.getLogger(DBConnServiceImpl.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Autowired
    private DBConnMapper dbConnMapper;

    @Override
    public List<DBConn> getAllConn() {
        return dbConnMapper.getAll();
    }

    @Override
    public DBConn getConnById(Long id) {
        return dbConnMapper.getById(id);
    }

    @Override
    public void deleteById(Long id) {
        dbConnMapper.delete(id);
    }

    @Override
    public void addOne(DBConn conn) {
        dbConnMapper.insertOne(conn);
    }
}
