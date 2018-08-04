package com.stanli.anomonitor.service.impl;

import com.stanli.anomonitor.db.DataSourceContextHolder;
import com.stanli.anomonitor.entity.DataStreamTask;
import com.stanli.anomonitor.entity.training.TaskStatus;
import com.stanli.anomonitor.mapper.DataStreamTaskMapper;
import com.stanli.anomonitor.service.DataSourceService;
import com.stanli.anomonitor.service.DataStreamTaskService;
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
