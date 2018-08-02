package com.stanli.anomonitor.service;


import com.stanli.anomonitor.entity.collect.CollectTask;

import java.util.List;

public interface CollectTaskService {

    void addTask(CollectTask queryTask);

    List<CollectTask> getAllTask();

}
