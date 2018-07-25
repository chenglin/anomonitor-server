package com.netease.anobot.entity;

import javax.persistence.*;


@Entity
@Table(name = "query_task")
public class QueryTask {

    @Id
    @GeneratedValue
    @Column(nullable = false)
    private Long id;
    @Column(name = "execute_sql")
    private String executeSql;
    @Column(name = "status")
    private TaskStatus status;
    @Column(name = "create_time")
    private String createTime;

    public QueryTask() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getExecuteSql() {
        return executeSql;
    }

    public void setExecuteSql(String executeSql) {
        this.executeSql = executeSql;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
