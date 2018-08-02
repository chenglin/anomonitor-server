package com.stanli.anomonitor.mapper;

import com.stanli.anomonitor.entity.collect.CollectTask;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface CollectTaskMapper {

    @Insert("INSERT INTO collect_task(dbName, dbIp, dbPort, dbUser, dbPasswd) VALUES " +
            "(#{dbName}, #{dbIp}, #{dbPort}, #{dbUser}, #{dbPasswd})")
    void addOne(CollectTask collectTask);

    @Select("SELECT * FROM collect_task")
    List<CollectTask> getAll();

    @Delete("DELETE FROM collect_task WHERE id = #{id}")
    void deleteById(Long id);

}

