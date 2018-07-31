package com.netease.anomonitor.controller;

import com.netease.anomonitor.service.DBConnService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.text.SimpleDateFormat;

@Controller
public class DBConnController {

    private final Logger logger = LoggerFactory.getLogger(DBConnController.class);
    private final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    @Autowired
    private DBConnService dbConnService;

    
}
