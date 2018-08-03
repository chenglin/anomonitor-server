package com.stanli.anomonitor.service.impl;

import com.stanli.anomonitor.entity.training.ScheduleSettings;
import com.stanli.anomonitor.mapper.ScheduleSettingsMapper;
import com.stanli.anomonitor.service.ScheduleSettingsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class ScheduleSettingsServiceImpl implements ScheduleSettingsService {
    private final Logger logger = LoggerFactory.getLogger(ScheduleSettingsServiceImpl.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Autowired
    private ScheduleSettingsMapper scheduleSettingsMapper;

    @Override
    public void updateScheduleSettings(ScheduleSettings scheduleSettings) {
        scheduleSettings.setUpdateTime(dateFormat.format(new Date()));
        logger.info("Update scheduleSettings = {}", scheduleSettings.toString());
        scheduleSettingsMapper.update(scheduleSettings);
    }

    @Override
    public ScheduleSettings getScheduleSettings() {
        return scheduleSettingsMapper.getFirst();
    }
}
