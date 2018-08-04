package com.netease.anomonitor.service.impl;

import com.netease.anomonitor.schedule.executor.InitTrainingExecutor;
import com.netease.anomonitor.service.TrainingService;
import com.netease.anomonitor.entity.DataStreamTask;
import com.netease.anomonitor.schedule.executor.InitTrainingExecutor;
import com.netease.anomonitor.service.TrainingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;

@Service
public class TrainingServiceImpl implements TrainingService {
    private final Logger logger = LoggerFactory.getLogger(TrainingServiceImpl.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Autowired
    private InitTrainingExecutor executor;

    public void startInitTraining(DataStreamTask task) {
        try {
            executor.doInitTraining();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.info("Init training model");
    }

}
