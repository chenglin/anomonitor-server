package com.stanli.anomonitor.entity.metrics;

public class Metrics {
    private Long id;
    private Integer taskId;
    private String timestamp;
    private String name;
    private String value;
    private String dimensionList;
    private Aggregation aggregation;

    public Metrics() {
        this.aggregation = Aggregation.AVERAGE;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDimensionList() {
        return dimensionList;
    }

    public void setDimensionList(String dimensionList) {
        this.dimensionList = dimensionList;
    }

    public Aggregation getAggregation() {
        return aggregation;
    }

    public void setAggregation(Aggregation aggregation) {
        this.aggregation = aggregation;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }
}
