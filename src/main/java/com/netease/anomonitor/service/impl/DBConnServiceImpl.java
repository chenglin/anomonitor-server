package com.netease.anomonitor.service.impl;

import com.netease.anomonitor.mapper.DBConnMapper;
import com.netease.anomonitor.service.DBConnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBConnServiceImpl implements DBConnService {

    @Autowired
    private DBConnMapper dbConnRepository;
}
