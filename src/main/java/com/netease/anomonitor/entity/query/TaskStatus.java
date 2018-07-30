package com.netease.anomonitor.entity.query;

public enum TaskStatus {

    START("start"),
    PROCESSING("processing"),
    DONE("done");

    private String name;

    TaskStatus(String name) {
        this.name = name;
    }

}
