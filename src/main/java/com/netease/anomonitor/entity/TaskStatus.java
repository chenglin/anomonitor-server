package com.netease.anomonitor.entity;

public enum TaskStatus {

    START("start"),
    PROCESSING("processing"),
    DONE("done");

    private String name;

    TaskStatus(String name) {
        this.name = name;
    }

}
