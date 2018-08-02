package com.stanli.anomonitor.service.impl;

import com.stanli.anomonitor.entity.collect.CollectTask;
import com.stanli.anomonitor.entity.collect.TaskStatus;
import com.stanli.anomonitor.mapper.CollectTaskMapper;
import com.stanli.anomonitor.service.CollectTaskService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.List;

@Service
public class CollectTaskServiceImpl implements CollectTaskService {
    private final Logger logger = LoggerFactory.getLogger(CollectTaskServiceImpl.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Autowired
    private CollectTaskMapper collectTaskMapper;

    @Override
    public void addTask(CollectTask collectTask) {
        collectTask.setStatus(TaskStatus.START);
        collectTaskMapper.addOne(collectTask);
    }

    @Override
    public void deleteTask(Long id) {
        collectTaskMapper.deleteById(id);
    }

    @Override
    public void updateTask(CollectTask collectTask) {

    }

    @Override
    public List<CollectTask> getAllTask() {
        return collectTaskMapper.getAll();
    }
}
