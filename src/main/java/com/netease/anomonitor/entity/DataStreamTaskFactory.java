package com.netease.anomonitor.entity;

public class DataStreamTaskFactory {

    private static volatile DataStreamTaskFactory instance;

    private DataStreamTaskFactory() {

    }

    public static synchronized DataStreamTaskFactory getInstance() {
        if (instance == null) {
            synchronized (DataStreamTaskFactory.class) {
                if (instance == null) {
                    instance = new DataStreamTaskFactory();
                }
            }
        }
        return instance;
    }

    public static DataStreamTask buildNewTask() {
        return new DataStreamTask();
    }

}
