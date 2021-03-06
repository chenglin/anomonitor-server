package com.netease.anomonitor.entity.training;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class ScheduleSettings {

    @JsonIgnore
    private Long id;
    private int queryEvery;
    private String recordsDelay;
    private String timezone;
    private String backfillPolicy;
    private String historicalTimeSpan;
    private String createTime;
    private String updateTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getQueryEvery() {
        return queryEvery;
    }

    public void setQueryEvery(int queryEvery) {
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

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ScheduleSettings{" +
                "id=" + id +
                ", queryEvery='" + queryEvery + '\'' +
                ", recordsDelay='" + recordsDelay + '\'' +
                ", timezone='" + timezone + '\'' +
                ", backfillPolicy='" + backfillPolicy + '\'' +
                ", historicalTimeSpan='" + historicalTimeSpan + '\'' +
                ", createTime='" + createTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                '}';
    }
}
