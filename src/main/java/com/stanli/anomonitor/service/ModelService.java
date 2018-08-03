package com.stanli.anomonitor.service;


import com.stanli.anomonitor.entity.model.Model;
import org.springframework.stereotype.Service;

@Service
public interface ModelService {

    void saveModel(Model model);

}
