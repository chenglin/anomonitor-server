package com.netease.anomonitor.service.impl;

import com.netease.anomonitor.service.QuerySettingsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;

@Service
public class QuerySettingsServiceImpl implements QuerySettingsService {
    private final Logger logger = LoggerFactory.getLogger(QuerySettingsServiceImpl.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

}
