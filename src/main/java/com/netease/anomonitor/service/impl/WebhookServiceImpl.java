package com.netease.anomonitor.service.impl;

import com.netease.anomonitor.mapper.WebhookMapper;
import com.netease.anomonitor.service.WebhookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WebhookServiceImpl implements WebhookService {

    @Autowired
    private WebhookMapper webhookRepository;

}
