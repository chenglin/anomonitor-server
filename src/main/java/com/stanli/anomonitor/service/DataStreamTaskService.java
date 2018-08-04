package com.stanli.anomonitor.service;

import com.stanli.anomonitor.entity.DataStreamTask;

import java.util.List;

public interface DataStreamTaskService {

    List<DataStreamTask> getAllTasks();

    void addTask(Long dbId, DataStreamTask task);

    void deleteTask(Long id);

    void updateTask(DataStreamTask task);

}
