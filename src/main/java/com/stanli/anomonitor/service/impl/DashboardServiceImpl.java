package com.stanli.anomonitor.service.impl;

import com.stanli.anomonitor.service.DashboardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;

@Service
public class DashboardServiceImpl implements DashboardService {
    private final Logger logger = LoggerFactory.getLogger(DashboardServiceImpl.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

}
