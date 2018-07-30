package com.netease.anomonitor.service.impl;

import com.netease.anomonitor.repository.DashboardRepository;
import com.netease.anomonitor.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DashboardServiceImpl implements DashboardService {

    @Autowired
    private DashboardRepository dashboardRepository;

}
