package com.stanli.anomonitor.entity.collect;

public enum TaskStatus {

    START("start"),
    TRAINING("processing"),
    DONE("done");

    private String name;

    TaskStatus(String name) {
        this.name = name;
    }

}
