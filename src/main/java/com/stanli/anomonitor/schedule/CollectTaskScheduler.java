package com.stanli.anomonitor.schedule;


import com.stanli.anomonitor.entity.collect.CollectTask;
import com.stanli.anomonitor.entity.collect.ScheduleSettings;
import com.stanli.anomonitor.entity.collect.TaskStatus;
import com.stanli.anomonitor.mapper.CollectTaskMapper;
import com.stanli.anomonitor.mapper.ScheduleSettingsMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.Trigger;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.support.PeriodicTrigger;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Component
public class CollectTaskScheduler {
    private Logger logger = LoggerFactory.getLogger(CollectTaskScheduler.class);
    private CollectTaskMapper collectTaskMapper;
    private ScheduleSettingsMapper scheduleSettingsMapper;
    private final TaskScheduler taskScheduler;

    @Autowired
    public CollectTaskScheduler(CollectTaskMapper collectTaskMapper,
                                TaskScheduler taskScheduler,
                                ScheduleSettingsMapper scheduleSettingsMapper) {
        this.collectTaskMapper = collectTaskMapper;
        this.taskScheduler = taskScheduler;
        this.scheduleSettingsMapper = scheduleSettingsMapper;
    }

    @Scheduled(cron = "0/5 * * * * ? ")   //每5秒执行一次
    public void collectTaskExecuteLoop() {
        List<CollectTask> tasks = collectTaskMapper.getAll();
        for (int i = 0; i < tasks.size(); i++) {
            CollectTask task = tasks.get(i);
            if (TaskStatus.START.equals(task.getStatus())) {
                ScheduleSettings scheduleSettings = scheduleSettingsMapper.getFirst();
                startInitTrainingTask(scheduleSettings, task);
                startPeriodCollectTask(scheduleSettings, task);
            }
        }
    }

    public void startInitTrainingTask(ScheduleSettings scheduleSettings, CollectTask task) {
        task.setStatus(TaskStatus.TRAINING);
        logger.info("Init training");
        task.setStatus(TaskStatus.DONE);
        logger.info("end training");
    }

    public void startPeriodCollectTask(ScheduleSettings scheduleSettings, CollectTask task) {
        Trigger trigger = new PeriodicTrigger(scheduleSettings.getQueryEvery(), TimeUnit.MINUTES);
        taskScheduler.schedule(this::collectPeriod, trigger);
    }

    public void collectPeriod() {
        logger.info("collect data from db");
    }


}
