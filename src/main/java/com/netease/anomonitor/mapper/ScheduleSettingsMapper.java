package com.netease.anomonitor.mapper;


import com.netease.anomonitor.entity.training.ScheduleSettings;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ScheduleSettingsMapper {

    @Update({"UPDATE schedule_settings SET query_every=#{queryEvery}, records_delay=#{recordsDelay}, timezone=#{timezone}," +
            "backfill_policy=#{backfillPolicy}, historical_timespan=#{historicalTimeSpan}, create_time=#{createTime}," +
            "update_time=#{updateTime}"})
    void update(ScheduleSettings scheduleSettings);

    @Select("SELECT * FROM schedule_settings")
    ScheduleSettings getFirst();

}
