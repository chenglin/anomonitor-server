package com.stanli.anomonitor.schedule.task;

import com.stanli.anomonitor.entity.metrics.Metrics;
import com.stanli.anomonitor.mapper.ScheduleSettingsMapper;
import com.stanli.anomonitor.service.MetricsService;
import com.stanli.anomonitor.service.ModelService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.Future;

@Component
public class InitTrainingTask {
    private static final Logger logger = LoggerFactory.getLogger(InitTrainingTask.class);

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
