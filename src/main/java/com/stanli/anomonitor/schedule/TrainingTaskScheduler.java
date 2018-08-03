package com.stanli.anomonitor.schedule;

import com.stanli.anomonitor.entity.training.TrainingTask;
import com.stanli.anomonitor.entity.training.TaskStatus;
import com.stanli.anomonitor.service.TrainingTaskService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TrainingTaskScheduler {
    private Logger logger = LoggerFactory.getLogger(TrainingTaskScheduler.class);
    private TrainingTaskService trainingTaskService;

    @Autowired
    public TrainingTaskScheduler(TrainingTaskService trainingTaskService) {
        this.trainingTaskService = trainingTaskService;
    }

    @Scheduled(cron = "0/5 * * * * ? ")   //每5秒执行一次
    public void collectTaskExecuteLoop() {
        logger.info("Collec task");
        List<TrainingTask> tasks = trainingTaskService.getAllTask();
        for (int i = 0; i < tasks.size(); i++) {
            TrainingTask task = tasks.get(i);
            if (TaskStatus.START_TRAINING.equals(task.getStatus())) {
                trainingTaskService.startInitTraining();
            } else if (TaskStatus.PERIODIC_TRAINING.equals("")) {
                trainingTaskService.startPeriodTraining();
            }
        }
    }


}
