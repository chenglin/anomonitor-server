package com.netease.anomonitor.service.impl;

import com.netease.anomonitor.service.QueryTaskService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;

@Service
public class QueryTaskServiceImpl implements QueryTaskService {
    private final Logger logger = LoggerFactory.getLogger(QueryTaskServiceImpl.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


}
