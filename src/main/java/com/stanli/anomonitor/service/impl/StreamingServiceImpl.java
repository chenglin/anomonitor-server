package com.stanli.anomonitor.service.impl;

import com.stanli.anomonitor.entity.DataStreamTask;
import com.stanli.anomonitor.schedule.executor.InitStreamingExecutor;
import com.stanli.anomonitor.service.StreamingService;
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
    private InitStreamingExecutor initStreamingWorker;

    @Override
    public void startInitStreaming(DataStreamTask task) {
        try {
            initStreamingWorker.initStreaming(task);
        } catch (InterruptedException e) {
            logger.error("{}", e.getMessage());
        }
    }

}

