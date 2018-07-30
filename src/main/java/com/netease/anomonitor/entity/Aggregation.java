package com.netease.anomonitor.entity;

public enum Aggregation {

    AVERAGE("Average"),
    SUM("Sum");

    private String name;

    Aggregation(String name) {
        this.name = name;
    }

}
