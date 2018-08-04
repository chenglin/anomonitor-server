package com.netease.anomonitor.service;

import com.netease.anomonitor.entity.DataStreamTask;

import java.util.List;

public interface DataStreamTaskService {

    List<DataStreamTask> getAllTasks();

    DataStreamTask getTasks(Integer taskId);

    Integer addTask(DataStreamTask task);

    void deleteTask(Integer taskId);

    void updateTask(DataStreamTask task);

}
