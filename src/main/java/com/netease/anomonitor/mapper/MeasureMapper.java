package com.netease.anomonitor.mapper;

import com.netease.anomonitor.entity.Measure;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface MeasureMapper {

    @Select("SELECT * FROM measure WHERE id = #{id}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "aggregation", column = "aggregation"),
            @Result(property = "taskId", column = "task_id")
    })
    Measure getById(Integer id);

    @Select("SELECT * FROM measure WHERE task_id = #{taskId}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "aggregation", column = "aggregation"),
            @Result(property = "taskId", column = "task_id")
    })
    List<Measure> listByTaskId(Integer taskId);

    @Insert("INSERT INTO measure (name, aggregation, task_id) " +
            "VALUES (#{name}, #{aggregation}, #{taskId})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    Integer insertOne(Measure measure);


    @Update("UPDATE measure SET name=#{name}, aggregation=#{aggregation}, " +
            "task_id=#{taskId} WHERE id=#{id}")
    Integer updateOne(Measure measure);


    @Delete("DELETE FROM measure WHERE id=#{id}")
    Integer deleteOne(Integer id);

}
