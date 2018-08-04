package com.netease.anomonitor.service;


import com.netease.anomonitor.entity.model.Model;
import org.springframework.stereotype.Service;

@Service
public interface ModelService {

    void saveModel(Model model);

}
