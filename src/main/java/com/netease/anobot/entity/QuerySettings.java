package com.netease.anobot.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "query_settings")
public class QuerySettings {
    @Id
    @GeneratedValue
    @Column(nullable = false)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "table")
    private String table;
    @Column(name = "database")
    private String database;
    @Column(name = "create_time")
    private String createTime;
    @Column(name = "update_time")
    private String updateTime;
    @OneToMany(targetEntity = QuerySettings.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "querySettingsId", updatable = false)
    private Set<MeasureItem> measures = new HashSet<>();
    @OneToMany(targetEntity = QuerySettings.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "querySettingsId", updatable = false)
    private Set<DimensionItem> dimensions = new HashSet<>();

    public QuerySettings() {
    }

    public QuerySettings(Set<MeasureItem> measures,
                         Set<DimensionItem> dimensions) {
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

    public Set<MeasureItem> getMeasures() {
        return measures;
    }

    public void setMeasures(Set<MeasureItem> measures) {
        this.measures = measures;
    }

    public Set<DimensionItem> getDimensions() {
        return dimensions;
    }

    public void setDimensions(Set<DimensionItem> dimensions) {
        this.dimensions = dimensions;
    }
}
