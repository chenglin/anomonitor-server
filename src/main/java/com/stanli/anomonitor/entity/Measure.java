package com.stanli.anomonitor.entity;

import com.stanli.anomonitor.entity.metrics.Aggregation;

public class Measure {
    private int id;
    private String name;
    private Aggregation aggregation;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Aggregation getAggregation() {
        return aggregation;
    }

    public void setAggregation(Aggregation aggregation) {
        this.aggregation = aggregation;
    }
}
