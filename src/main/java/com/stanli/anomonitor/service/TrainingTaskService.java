package com.stanli.anomonitor.service;


import com.stanli.anomonitor.entity.training.TrainingTask;

import java.util.List;

public interface TrainingTaskService {

    void addTask(TrainingTask collectTask);

    void deleteTask(Long id);

    void updateTask(TrainingTask collectTask);

    List<TrainingTask> getAllTask();

    void startInitTraining();

    void startPeriodTraining();

}
