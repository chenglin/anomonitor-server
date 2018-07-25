package com.netease.anobot.entity;

public enum TaskStatus {

    START("start"),
    PROCESSING("processing"),
    DONE("done");

    private String name;

    TaskStatus(String name) {
        this.name = name;
    }

}
