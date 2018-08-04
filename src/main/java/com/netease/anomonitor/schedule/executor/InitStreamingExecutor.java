package com.netease.anomonitor.schedule.executor;

import com.netease.anomonitor.entity.Dimension;
import com.netease.anomonitor.datasource.DynamicDataSourceDelegate;
import com.netease.anomonitor.entity.DataSource;
import com.netease.anomonitor.entity.DataStreamTask;
import com.netease.anomonitor.entity.Dimension;
import com.netease.anomonitor.entity.Measure;
import com.netease.anomonitor.entity.training.ScheduleSettings;
import com.netease.anomonitor.entity.training.TaskStatus;
import com.netease.anomonitor.mapper.ScheduleSettingsMapper;
import com.netease.anomonitor.service.DataStreamTaskService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class InitStreamingExecutor {
    private final Logger logger = LoggerFactory.getLogger(InitStreamingExecutor.class);

    @Autowired
    private ScheduleSettingsMapper scheduleSettingsMapper;

    @Autowired
    private DataStreamTaskService dataStreamTaskService;

    @Async
    public void initStreaming(DataStreamTask task) throws InterruptedException {
        updateStatus(task, TaskStatus.STREAMING_DATA);
        logger.info("Start data streaming task, task id = {}, task status = {}", task.getId(), task.getTaskStatus());
        initDataSource(task.getDataSource());
        streamingData(task);
        updateStatus(task, TaskStatus.STREAMING_DATA_END);
        logger.info("Data streaming end, task id = {}, task status = {}", task.getId(), task.getTaskStatus());
    }

    private void streamingData(DataStreamTask task) {
        String schemaName = task.getSchemaName();
        List<Measure> measures = task.getMeasures();
        List<Dimension> dimensions = task.getDimensions();
        ScheduleSettings scheduleSettings = scheduleSettingsMapper.getFirst();
        scheduleSettings.getHistoricalTimeSpan();
    }

    private void updateStatus(DataStreamTask task, TaskStatus status) {
        task.setTaskStatus(status);
        dataStreamTaskService.updateTask(task);
    }

    private void initDataSource(DataSource ds) {
        // 切换数据源，爬取数据
        DynamicDataSourceDelegate.setDataSource(ds);
    }


}
