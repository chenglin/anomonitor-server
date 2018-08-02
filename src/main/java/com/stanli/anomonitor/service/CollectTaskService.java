package com.stanli.anomonitor.service;


import com.stanli.anomonitor.entity.collect.CollectTask;

import java.util.List;

public interface CollectTaskService {

    void addTask(CollectTask collectTask);

    void deleteTask(Long id);

    void updateTask(CollectTask collectTask);

    List<CollectTask> getAllTask();

}
