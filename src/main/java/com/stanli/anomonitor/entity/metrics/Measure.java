package com.stanli.anomonitor.entity.metrics;

public class Measure {
    private Long id;
    private String name;
    private Aggregation changes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Aggregation getChanges() {
        return changes;
    }

    public void setChanges(Aggregation changes) {
        this.changes = changes;
    }
}
