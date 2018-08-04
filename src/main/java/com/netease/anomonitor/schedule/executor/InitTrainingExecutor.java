package com.netease.anomonitor.schedule.executor;

import com.netease.anomonitor.service.MetricsService;
import com.netease.anomonitor.entity.metrics.Metrics;
import com.netease.anomonitor.mapper.ScheduleSettingsMapper;
import com.netease.anomonitor.service.ModelService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.Future;

@Component
public class InitTrainingExecutor {
    private static final Logger logger = LoggerFactory.getLogger(InitTrainingExecutor.class);

    @Autowired
    private ScheduleSettingsMapper scheduleSettingsMapper;

    @Autowired
    private MetricsService metricsService;

    @Autowired
    private ModelService modelService;

    @Async
    public Future<String> doInitTraining() throws InterruptedException {
        List<Metrics> metrics = metricsService.getAllMetrics();

        return new AsyncResult<>("");
    }

}
