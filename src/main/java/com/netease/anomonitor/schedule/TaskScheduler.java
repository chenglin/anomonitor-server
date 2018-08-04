package com.netease.anomonitor.schedule;

import com.netease.anomonitor.entity.DataStreamTask;
import com.netease.anomonitor.entity.training.TaskStatus;
import com.netease.anomonitor.service.DataStreamTaskService;
import com.netease.anomonitor.service.StreamingService;
import com.netease.anomonitor.service.TrainingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TaskScheduler {
    private Logger logger = LoggerFactory.getLogger(TaskScheduler.class);

    @Autowired
    private DataStreamTaskService dataStreamTaskService;
    @Autowired
    private StreamingService streamingService;
    @Autowired
    private TrainingService trainingService;

    @Scheduled(cron = "0/5 * * * * ? ")   //每5秒执行一次
    public void collectTaskExecuteLoop() {
        logger.info("Collec executor");
        List<DataStreamTask> tasks = dataStreamTaskService.getAllTasks();
        if (tasks != null) {
            for (int i = 0; i < tasks.size(); i++) {
                DataStreamTask task = tasks.get(i);
                if (TaskStatus.INIT_TASK.equals(task.getTaskStatus())) {
                    streamingService.startInitStreaming(task);
                } else if (TaskStatus.STREAMING_DATA_END.equals(task.getTaskStatus())) {
                    trainingService.startInitTraining(task);
                } else if (TaskStatus.INIT_TREANING_END.equals(task.getTaskStatus())) {

                }
            }
        }
    }

}
