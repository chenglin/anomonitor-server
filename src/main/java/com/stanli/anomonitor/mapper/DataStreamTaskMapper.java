package com.stanli.anomonitor.mapper;

import com.stanli.anomonitor.entity.DataStreamTask;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface DataStreamTaskMapper {

    @Insert("INSERT INTO data_stream_task () VALUES ()")
    Integer insertOne(DataStreamTask task);

    @Select("SELECT * FROM data_stream_task")
    DataStreamTask getAll();

}
