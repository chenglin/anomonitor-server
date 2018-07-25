package com.netease.anobot.model.alert;

public enum AlertSeverity {

    CRITICAL("Critical"),
    HIGH("High"),
    MEDIUM("Medium"),
    LOW("Low"),
    INFO("Info");

    private String name;

    AlertSeverity(String name) {
        this.name = name;
    }
}
