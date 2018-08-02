package com.stanli.anomonitor.service.impl;

import com.stanli.anomonitor.entity.collect.CollectTask;
import com.stanli.anomonitor.entity.collect.ScheduleSettings;
import com.stanli.anomonitor.mapper.CollectTaskMapper;
import com.stanli.anomonitor.service.CollectTaskService;
import com.stanli.anomonitor.service.ScheduleSettingsService;
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
    private ScheduleSettingsService scheduleSettingsService;

    @Autowired
    private CollectTaskMapper collectTaskMapper;

    @Override
    public void addTask(CollectTask task) {
        ScheduleSettings scheduleSettings = scheduleSettingsService.getScheduleSettings();

    }

    @Override
    public List<CollectTask> getAllTask() {
        return collectTaskMapper.getAll();
    }
}
