package com.stanli.anomonitor.entity;

import com.stanli.anomonitor.entity.training.TaskStatus;

public class DataStreamTask {

    private Long id;
    private Long connId;
    private TaskStatus taskStatus;

    public DataStreamTask() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getConnId() {
        return connId;
    }

    public void setConnId(Long connId) {
        this.connId = connId;
    }

    public TaskStatus getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }
}
