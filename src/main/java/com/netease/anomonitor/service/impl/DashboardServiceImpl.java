package com.netease.anomonitor.service.impl;

import com.netease.anomonitor.mapper.DashboardMapper;
import com.netease.anomonitor.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DashboardServiceImpl implements DashboardService {

    @Autowired
    private DashboardMapper dashboardRepository;

}
