package com.stanli.anomonitor.service;

import com.stanli.anomonitor.entity.collect.ScheduleSettings;

public interface ScheduleSettingsService {

    void updateScheduleSettings(ScheduleSettings scheduleSettings);

    ScheduleSettings getScheduleSettings();

}
