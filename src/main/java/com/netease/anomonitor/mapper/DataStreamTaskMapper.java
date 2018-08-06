package com.netease.anomonitor.mapper;

import com.netease.anomonitor.entity.DataStreamTask;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface DataStreamTaskMapper {

    @Insert("INSERT INTO data_stream_task (name, create_time, schema_name, task_status, ds_id) VALUES" +
            " (#{name}, #{createTime}, #{schemaName}, #{taskStatus}, #{dataSource})")
    Integer insertOne(DataStreamTask task);


    @Update("UPDATE data_source SET name=#{name} WHERE id=#{id}")
    Integer updateOne(DataStreamTask task);


    @Select("SELECT * FROM data_stream_task")
    @Results(
            {
                    @Result(column = "name", property = "name"),
                    @Result(column = "create_time", property = "createTime"),
                    @Result(column = "schema_name", property = "schemaName"),
                    @Result(column = "task_status", property = "taskStatus"),
                    @Result(column = "ds_id", property = "dataSource",
                            one = @One(select = "com.netease.anomonitor.mapper.DataSourceMapper.getById")),
                    @Result(property = "measures", column = "task_id",
                            many = @Many(select = "ccom.netease.anomonitor.mapper.MeasureMapper.listByTaskId")),
                    @Result(property = "dimensions", column = "task_id",
                            many = @Many(select = "com.netease.anomonitor.mapper.DimensionMapper.listByTaskId"))
            })
    List<DataStreamTask> getAll();


    @Select("SELECT * FROM data_stream_task where id=#{id}")
    @Results(
            {
                    @Result(column = "name", property = "name"),
                    @Result(column = "create_time", property = "createTime"),
                    @Result(column = "schema_name", property = "schemaName"),
                    @Result(column = "task_status", property = "taskStatus"),
                    @Result(column = "ds_id", property = "dataSource",
                            one = @One(select = "com.netease.anomonitor.mapper.DataSourceMapper.getById")),
                    @Result(property = "measures", column = "task_id",
                            many = @Many(select = "ccom.netease.anomonitor.mapper.MeasureMapper.listByTaskId")),
                    @Result(property = "dimensions", column = "task_id",
                            many = @Many(select = "com.netease.anomonitor.mapper.DimensionMapper.listByTaskId"))
            })
    DataStreamTask getById(Integer id);


    @Delete("DELETE FROM data_source WHERE id=#{id}")
    Integer deleteOne(Integer id);
}
