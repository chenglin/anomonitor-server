package com.stanli.anomonitor.controller;

import com.stanli.anomonitor.entity.response.ResponseContent;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data-stream")
public class DataStreamController {

    @ApiOperation(value = "", notes = "")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseContent addTask(
            @RequestParam String dsId,
            @RequestParam String schemaName
    ) {

        return null;
    }
}
