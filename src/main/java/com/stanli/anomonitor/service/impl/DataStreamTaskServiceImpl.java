package com.stanli.anomonitor.service.impl;

import com.stanli.anomonitor.entity.DataStreamTask;
import com.stanli.anomonitor.service.DataStreamTaskService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataStreamTaskServiceImpl implements DataStreamTaskService {

    @Override
    public List<DataStreamTask> getAllTasks() {
        return null;
    }

    @Override
    public void addTask(Long dbId, DataStreamTask task) {

    }

    @Override
    public void delTask(Long id) {

    }

    @Override
    public void updateTask(DataStreamTask task) {

    }

}
