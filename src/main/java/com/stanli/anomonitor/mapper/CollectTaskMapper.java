package com.stanli.anomonitor.mapper;

import com.stanli.anomonitor.entity.collect.CollectTask;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface CollectTaskMapper {

    @Insert("")
    void addOne(CollectTask collectTask);

    @Select("")
    List<CollectTask> getAll();

}

