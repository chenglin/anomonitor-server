package com.stanli.anomonitor.schedule;

import com.stanli.anomonitor.entity.DataStreamTask;
import com.stanli.anomonitor.entity.training.TaskStatus;
import com.stanli.anomonitor.service.DataStreamTaskService;
import com.stanli.anomonitor.service.StreamingService;
import com.stanli.anomonitor.service.TrainingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TaskScheduler {
    private Logger logger = LoggerFactory.getLogger(TaskScheduler.class);
    private DataStreamTaskService dataStreamTaskServicea;
    private StreamingService streamingService;
    private TrainingService trainingService;

    @Autowired
    public TaskScheduler(DataStreamTaskService dataStreamTaskServicea,
                         StreamingService streamingService,
                         TrainingService trainingService) {
        this.dataStreamTaskServicea = dataStreamTaskServicea;
        this.streamingService = streamingService;
        this.trainingService = trainingService;
    }

    @Scheduled(cron = "0/5 * * * * ? ")   //每5秒执行一次
    public void collectTaskExecuteLoop() {
        logger.info("Collec task");
        List<DataStreamTask> tasks = dataStreamTaskServicea.getAllTasks();
        for (int i = 0; i < tasks.size(); i++) {
            DataStreamTask task = tasks.get(i);
            if (TaskStatus.INIT_TASK.equals(task.getTaskStatus())) {
                streamingService.startInitStreaming();
            } else if (TaskStatus.STREAMING_DATA_END.equals(task.getTaskStatus())) {
                trainingService.startInitTraining();
            } else if (TaskStatus.INIT_TREANING_END.equals(task.getTaskStatus())) {

            }
        }
    }


}
