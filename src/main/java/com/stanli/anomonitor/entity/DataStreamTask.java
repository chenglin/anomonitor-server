package com.stanli.anomonitor.entity;

import com.stanli.anomonitor.entity.training.TaskStatus;

public class DataStreamTask {
    private Long id;
    private TaskStatus taskStatus;
    private String name;
    private String createTime;

    public DataStreamTask() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TaskStatus getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
