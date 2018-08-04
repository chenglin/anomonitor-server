package com.netease.anomonitor.service.impl;

import com.netease.anomonitor.service.MetricsService;
import com.netease.anomonitor.entity.metrics.Metrics;
import com.netease.anomonitor.service.MetricsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MetricsServiceImpl implements MetricsService {

    @Override
    public List<Metrics> getAllMetrics() {

        return null;
    }

    @Override
    public void saveMetrics(Metrics metrics) {

    }
}
