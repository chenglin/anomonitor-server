package com.netease.anomonitor.controller;

import com.netease.anomonitor.entity.DataSource;
import com.netease.anomonitor.entity.DataStreamTask;
import com.netease.anomonitor.entity.DataStreamTaskFactory;
import com.netease.anomonitor.entity.response.ResponseContent;
import com.netease.anomonitor.service.DataSourceService;
import com.netease.anomonitor.service.DataStreamTaskService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/data-stream")
public class DataStreamTaskController {

    @Autowired
    private DataStreamTaskService dataStreamTaskService;

    @Autowired
    private DataSourceService dataSourceService;

    @ApiOperation(value = "", notes = "")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseContent<Integer> addTask(
            @RequestParam Integer dsId,
            @RequestParam String schemaName) {
        DataStreamTask task = DataStreamTaskFactory.getInstance().buildNewTask();
        DataSource ds = dataSourceService.getDataSourceById(dsId);
        task.setSchemaName(schemaName);
        task.setDataSource(ds);
        Integer id = dataStreamTaskService.addTask(task);
        return new ResponseContent<>(true, id, "");
    }

    @ApiOperation(value = "", notes = "")
    @RequestMapping(value = "/all-tasks", method = RequestMethod.GET)
    public ResponseContent<List<DataStreamTask>> getAllTask() {

        return null;
    }


    @ApiOperation(value = "", notes = "")
    @RequestMapping(value = "/task", method = RequestMethod.GET)
    public ResponseContent<DataStreamTask> getTask(
            @RequestParam String taskId) {

        return null;
    }


    @ApiOperation(value = "", notes = "")
    @RequestMapping(value = "/start", method = RequestMethod.GET)
    public ResponseContent<Boolean> startTask(
            @RequestParam String taskId) {

        return null;
    }

}
