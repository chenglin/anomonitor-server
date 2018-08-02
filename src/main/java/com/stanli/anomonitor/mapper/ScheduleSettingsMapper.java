package com.stanli.anomonitor.mapper;


import com.stanli.anomonitor.entity.collect.ScheduleSettings;
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
