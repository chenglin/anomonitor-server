package com.netease.anomonitor.service.impl;

import com.netease.anomonitor.schedule.executor.InitStreamingExecutor;
import com.netease.anomonitor.service.StreamingService;
import com.netease.anomonitor.entity.DataStreamTask;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created on 2018/8/3 14:52.
 *
 * @author Stanley Huang
 */

@Service
public class StreamingServiceImpl implements StreamingService {

    private final static Logger logger = LoggerFactory.getLogger(StreamingServiceImpl.class);

    @Autowired
    private InitStreamingExecutor executor;

    @Override
    public void startInitStreaming(DataStreamTask task) {
        // start thread
        try {
            executor.initStreaming(task);
        } catch (InterruptedException e) {
            logger.error("{}", e.getMessage());
        }
    }

}

