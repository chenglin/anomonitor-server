package com.netease.anomonitor.service.impl;

import com.netease.anomonitor.mapper.EmailMapper;
import com.netease.anomonitor.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {

    @Autowired
    private EmailMapper emailRepository;

}
