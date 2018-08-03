package com.stanli.anomonitor.controller;

import com.stanli.anomonitor.entity.training.TrainingTask;
import com.stanli.anomonitor.entity.response.ResponseContent;
import com.stanli.anomonitor.service.TrainingTaskService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TrainingTaskController {

    @Autowired
    private TrainingTaskService trainingTaskService;

    @ApiOperation("")
    public ResponseContent<List<TrainingTask>> addTask(@RequestBody TrainingTask trainingTask) {
        trainingTaskService.addTask(trainingTask);
        return null;
    }
}
