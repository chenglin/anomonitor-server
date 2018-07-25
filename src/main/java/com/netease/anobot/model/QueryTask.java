package com.netease.anobot.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "query_task")
public class QueryTask {
    @Id
    @GeneratedValue
    @Column(name = "Id", nullable = false)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "status")
    private TaskStatus status;
    private QuerySchedule schedule;
    @Column(name = "table_name")
    private String tableName;
    @Column(name = "create_time")
    private String createTime;
    @Column(name = "update_time")
    private String updateTime;
    private List<String> measures;
    private List<String> dimensions;

    public QueryTask() {
        this.status = TaskStatus.START;
    }

    public QueryTask(QuerySchedule schedule) {
        super();
        this.schedule = schedule;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public QuerySchedule getSchedule() {
        return schedule;
    }

    public void setSchedule(QuerySchedule schedule) {
        this.schedule = schedule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getMeasures() {
        return measures;
    }

    public void setMeasures(List<String> measures) {
        this.measures = measures;
    }

    public List<String> getDimensions() {
        return dimensions;
    }

    public void setDimensions(List<String> dimensions) {
        this.dimensions = dimensions;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
}
