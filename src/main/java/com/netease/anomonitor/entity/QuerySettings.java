package com.netease.anomonitor.entity;

import java.util.HashSet;
import java.util.Set;

public class QuerySettings {
    private Long id;
    private String name;
    private String table;
    private String database;
    private String createTime;
    private String updateTime;
    private Set<Measure> measures = new HashSet<>();
    private Set<Dimension> dimensions = new HashSet<>();

    public QuerySettings() {
    }

    public QuerySettings(Set<Measure> measures,
                         Set<Dimension> dimensions) {
        this.measures = measures;
        this.dimensions = dimensions;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public Set<Measure> getMeasures() {
        return measures;
    }

    public void setMeasures(Set<Measure> measures) {
        this.measures = measures;
    }

    public Set<Dimension> getDimensions() {
        return dimensions;
    }

    public void setDimensions(Set<Dimension> dimensions) {
        this.dimensions = dimensions;
    }
}
