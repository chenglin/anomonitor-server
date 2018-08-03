package com.stanli.anomonitor.service;

import com.stanli.anomonitor.entity.metrics.Metrics;

import java.util.List;

public interface MetricsService {

    List<Metrics> getAllMetrics();

    void saveMetrics(Metrics metrics);

}
