package com.netease.anomonitor.service.impl;

import com.netease.anomonitor.datasource.DataSourceContextHolder;
import com.netease.anomonitor.entity.training.TaskStatus;
import com.netease.anomonitor.mapper.DataStreamTaskMapper;
import com.netease.anomonitor.service.DataSourceService;
import com.netease.anomonitor.entity.DataStreamTask;
import com.netease.anomonitor.service.DataStreamTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataStreamTaskServiceImpl implements DataStreamTaskService {

    @Autowired
    private DataStreamTaskMapper dataStreamTaskMapper;

    @Autowired
    private DataSourceService dataSourceService;

    @Override
    public List<DataStreamTask> getAllTasks() {
        return null;
    }

    @Override
    public DataStreamTask getTasks(Integer taskId) {
        return null;
    }

    @Override
    public Integer addTask(DataStreamTask task) {
        DataSourceContextHolder.setDBType("default");
        task.setTaskStatus(TaskStatus.INIT_TASK);
        return dataStreamTaskMapper.insertOne(task);
    }

    @Override
    public void deleteTask(Integer taskId) {

    }

    @Override
    public void updateTask(DataStreamTask task) {

    }

}
