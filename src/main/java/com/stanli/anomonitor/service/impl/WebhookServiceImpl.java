package com.stanli.anomonitor.service.impl;

import com.stanli.anomonitor.service.WebhookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;

@Service
public class WebhookServiceImpl implements WebhookService {
    private final Logger logger = LoggerFactory.getLogger(WebhookServiceImpl.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

}
