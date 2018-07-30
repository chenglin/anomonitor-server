package com.netease.anomonitor.service.impl;

import com.netease.anomonitor.mapper.QuerySettingsMapper;
import com.netease.anomonitor.service.QuerySettingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuerySettingsServiceImpl implements QuerySettingsService {

    @Autowired
    private QuerySettingsMapper querySettingsRepository;
}
