package com.stanli.anomonitor.mapper;

import com.stanli.anomonitor.entity.training.TrainingTask;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface TrainingTaskMapper {

    @Insert("INSERT INTO training_task(db_name, db_ip, dbPort, dbUser, dbPasswd) VALUES " +
            "(#{dbName}, #{dbIp}, #{dbPort}, #{dbUser}, #{dbPasswd})")
    void addOne(TrainingTask collectTask);

    @Select("SELECT * FROM training_task")
    List<TrainingTask> getAll();

    @Delete("DELETE FROM training_task WHERE id = #{id}")
    void deleteById(Long id);

}

