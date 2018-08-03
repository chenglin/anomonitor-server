package com.stanli.anomonitor.service.impl;

import com.stanli.anomonitor.entity.metrics.Metrics;
import com.stanli.anomonitor.service.MetricsService;
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
