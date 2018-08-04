package com.stanli.anomonitor.service;

import com.stanli.anomonitor.entity.DataStreamTask;

/**
 * Created on 2018/8/3 14:52.
 *
 * @author Stanley Huang
 */
public interface StreamingService {

    void startInitStreaming(DataStreamTask task);

}
