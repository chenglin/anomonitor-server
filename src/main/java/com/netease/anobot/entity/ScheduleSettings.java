package com.netease.anobot.entity;

import javax.persistence.*;

@Entity
@Table(name = "schedule_settings")
public class ScheduleSettings {

    @Id
    @GeneratedValue
    @Column(nullable = false)
    private Long id;
    @Column(name = "query_every")
    private String queryEvery;
    @Column(name = "records_delay")
    private String recordsDelay;
    @Column(name = "timezone")
    private String timezone;
    @Column(name = "backfill_policy")
    private String backfillPolicy;
    @Column(name = "historical_timespan")
    private String historicalTimeSpan;
    @Column(name = "create_time")
    private String createTime;
    @Column(name = "update_time")
    private String updateTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getQueryEvery() {
        return queryEvery;
    }

    public void setQueryEvery(String queryEvery) {
        this.queryEvery = queryEvery;
    }

    public String getRecordsDelay() {
        return recordsDelay;
    }

    public void setRecordsDelay(String recordsDelay) {
        this.recordsDelay = recordsDelay;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getBackfillPolicy() {
        return backfillPolicy;
    }

    public void setBackfillPolicy(String backfillPolicy) {
        this.backfillPolicy = backfillPolicy;
    }

    public String getHistoricalTimeSpan() {
        return historicalTimeSpan;
    }

    public void setHistoricalTimeSpan(String historicalTimeSpan) {
        this.historicalTimeSpan = historicalTimeSpan;
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
}
