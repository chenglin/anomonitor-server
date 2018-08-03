package com.stanli.anomonitor.service.impl;

import com.stanli.anomonitor.entity.training.ScheduleSettings;
import com.stanli.anomonitor.entity.training.TrainingTask;
import com.stanli.anomonitor.entity.training.TaskStatus;
import com.stanli.anomonitor.mapper.ScheduleSettingsMapper;
import com.stanli.anomonitor.mapper.TrainingTaskMapper;
import com.stanli.anomonitor.service.TrainingTaskService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.support.PeriodicTrigger;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
public class TrainingTaskServiceImpl implements TrainingTaskService {
    private final Logger logger = LoggerFactory.getLogger(TrainingTaskServiceImpl.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Autowired
    private TrainingTaskMapper trainingTaskMapper;

    @Autowired
    private ScheduleSettingsMapper scheduleSettingsMapper;

    @Autowired
    private TaskScheduler taskScheduler;

    @Override
    public void addTask(TrainingTask collectTask) {
        collectTask.setStatus(TaskStatus.START_TRAINING);
        trainingTaskMapper.addOne(collectTask);
    }

    @Override
    public void deleteTask(Long id) {
        trainingTaskMapper.deleteById(id);
    }

    @Override
    public void updateTask(TrainingTask collectTask) {

    }

    @Override
    public List<TrainingTask> getAllTask() {
        return trainingTaskMapper.getAll();
    }


    public void startInitTraining() {
        logger.info("Init training model");
        ScheduleSettings scheduleSettings = scheduleSettingsMapper.getFirst();
        PeriodicTrigger trigger = new PeriodicTrigger(scheduleSettings.getQueryEvery(), TimeUnit.SECONDS);
        taskScheduler.schedule(this::startPeriodTraining, trigger);
    }

    public void startPeriodTraining() {
        logger.info("Start period training");
    }
}
