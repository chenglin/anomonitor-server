package com.netease.anomonitor.mapper;

import com.netease.anomonitor.entity.DataStreamTask;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface DataStreamTaskMapper {

    @Insert("INSERT INTO data_stream_task () VALUES ()")
    Integer insertOne(DataStreamTask task);

    @Select("SELECT * FROM data_stream_task")
    @Results(
            {
                    @Result(id = true, column = "tutor_id", property = "tutorId"),
                    @Result(column = "name", property = "name"),
                    @Result(column = "create_time", property = "createTime"),
                    @Result(column = "schema_name", property = "schemaName"),
                    @Result(column = "task_status", property = "taskStatus"),
                    @Result(property = "dataSource", column = "ds_id",
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
                    @Result(id = true, column = "tutor_id", property = "tutorId"),
                    @Result(column = "name", property = "name"),
                    @Result(column = "create_time", property = "createTime"),
                    @Result(column = "schema_name", property = "schemaName"),
                    @Result(column = "task_status", property = "taskStatus"),
                    @Result(property = "dataSource", column = "ds_id",
                            one = @One(select = "com.netease.anomonitor.mapper.DataSourceMapper.getById")),
                    @Result(property = "measures", column = "task_id",
                            many = @Many(select = "ccom.netease.anomonitor.mapper.MeasureMapper.listByTaskId")),
                    @Result(property = "dimensions", column = "task_id",
                            many = @Many(select = "com.netease.anomonitor.mapper.DimensionMapper.listByTaskId"))
            })
    DataStreamTask getById(Integer id);
}
