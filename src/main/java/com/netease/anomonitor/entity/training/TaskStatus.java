package com.netease.anomonitor.entity.training;

public enum TaskStatus {
    INIT_TASK,
    STREAMING_DATA,
    STREAMING_DATA_END,
    INIT_TRAINING,
    INIT_TREANING_END,
    PERIODIC_TRAINING,
}
