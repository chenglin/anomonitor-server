package com.stanli.anomonitor.service;

import com.stanli.anomonitor.entity.DataStreamTask;

import java.util.List;

public interface DataStreamTaskService {

    List<DataStreamTask> getAllTasks();

    Integer addTask(DataStreamTask task);

    void deleteTask(Integer taskId);

    void updateTask(DataStreamTask task);

}
