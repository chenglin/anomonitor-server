package com.stanli.anomonitor.controller;

import com.stanli.anomonitor.entity.DataSource;
import com.stanli.anomonitor.entity.DataStreamTask;
import com.stanli.anomonitor.entity.DataStreamTaskFactory;
import com.stanli.anomonitor.entity.response.ResponseContent;
import com.stanli.anomonitor.service.DataSourceService;
import com.stanli.anomonitor.service.DataStreamTaskService;
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
    @RequestMapping(value = "/all-tasks")
    public ResponseContent<List<DataStreamTask>> getAllTask() {

        return null;
    }


    @ApiOperation(value = "", notes = "")
    @RequestMapping(value = "/start")
    public ResponseContent<Boolean> startTask() {

        return null;
    }

}
