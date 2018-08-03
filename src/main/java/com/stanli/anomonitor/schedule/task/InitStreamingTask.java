package com.stanli.anomonitor.schedule.task;

import com.stanli.anomonitor.mapper.ScheduleSettingsMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;

@Component
public class InitStreamingTask {
    private final Logger logger = LoggerFactory.getLogger(InitStreamingTask.class);

    @Autowired
    private ScheduleSettingsMapper scheduleSettingsMapper;



    @Async
    public Future<String> doInitStreaming() throws InterruptedException {


        return new AsyncResult<>("");
    }


}
