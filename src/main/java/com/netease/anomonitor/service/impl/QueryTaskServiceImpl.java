package com.netease.anomonitor.service.impl;

import com.netease.anomonitor.mapper.QueryTaskMapper;
import com.netease.anomonitor.service.QueryTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QueryTaskServiceImpl implements QueryTaskService {

    @Autowired
    private QueryTaskMapper queryTaskRepository;

}
