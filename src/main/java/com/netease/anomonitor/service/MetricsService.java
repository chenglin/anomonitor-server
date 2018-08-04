package com.netease.anomonitor.service;

import com.netease.anomonitor.entity.metrics.Metrics;

import java.util.List;

public interface MetricsService {

    List<Metrics> getAllMetrics();

    void saveMetrics(Metrics metrics);

}
