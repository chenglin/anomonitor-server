package com.netease.anobot.model;

public enum Status {

    START("start"),
    PROCESSING("processing"),
    DONE("done");

    private String name;

    Status(String name) {
        this.name = name;
    }

}
