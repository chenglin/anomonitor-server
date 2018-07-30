package com.netease.anomonitor.service.impl;

import com.netease.anomonitor.repository.DBConnRepository;
import com.netease.anomonitor.service.DBConnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBConnServiceImpl implements DBConnService {

    @Autowired
    private DBConnRepository dbConnRepository;
}
