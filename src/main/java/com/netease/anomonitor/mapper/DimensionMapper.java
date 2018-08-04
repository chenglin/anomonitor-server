package com.netease.anomonitor.mapper;

import com.netease.anomonitor.entity.Dimension;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface DimensionMapper {

    @Select("SELECT * FROM dimension WHERE id = #{id}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "taskId", column = "task_id")
    })
    Dimension getById(Integer id);

    @Select("SELECT * FROM dimension WHERE task_id = #{taskId}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "taskId", column = "task_id")
    })
    List<Dimension> listByTaskId(Integer taskId);

    @Insert("INSERT INTO dimension (name, task_id) VALUES (#{name}, #{taskId})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    Integer insertOne(Dimension dimenion);


    @Update("UPDATE dimension SET name=#{name}, task_id=#{taskId} WHERE id=#{id}")
    Integer updateOne(Dimension dimenion);


    @Delete("DELETE FROM dimension WHERE id=#{id}")
    Integer deleteOne(Integer id);
}
