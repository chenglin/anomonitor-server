package com.stanli.anomonitor.controller;

import com.stanli.anomonitor.entity.collect.CollectTask;
import com.stanli.anomonitor.entity.response.ResponseContent;
import com.stanli.anomonitor.service.CollectTaskService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CollectTaskController {

    @Autowired
    private CollectTaskService collectTaskService;

    @ApiOperation("")
    public ResponseContent<List<CollectTask>> addQueryTask(@RequestBody CollectTask queryTask) {
        collectTaskService.addTask(queryTask);
        return null;
    }
}
