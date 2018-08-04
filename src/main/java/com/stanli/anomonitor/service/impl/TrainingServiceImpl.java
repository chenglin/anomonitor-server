package com.stanli.anomonitor.service.impl;

import com.stanli.anomonitor.schedule.executor.InitTrainingExecutor;
import com.stanli.anomonitor.service.TrainingService;
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
    private InitTrainingExecutor initTrainingTask;

    public void startInitTraining() {
        try {
            initTrainingTask.doInitTraining();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.info("Init training model");
    }

}
