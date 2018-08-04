package com.netease.anomonitor.service;

import com.netease.anomonitor.entity.training.ScheduleSettings;

public interface ScheduleSettingsService {

    void updateScheduleSettings(ScheduleSettings scheduleSettings);

    ScheduleSettings getScheduleSettings();

}
