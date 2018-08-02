package com.stanli.anomonitor.mapper;


import com.stanli.anomonitor.entity.conn.DBConn;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface DBConnMapper {

    @Select("SELECT * FROM db_conns")
    @Results({
            @Result(property = "dbName", column = "db_name"),
            @Result(property = "dbIp", column = "db_ip"),
            @Result(property = "dbPort", column = "db_port"),
            @Result(property = "dbUser", column = "db_user"),
            @Result(property = "dbPasswd", column = "db_passwd"),
    })
    List<DBConn> getAll();

    @Select("SELECT * FROM db_conns WHERE id = #{id}")
    @Results({
            @Result(property = "dbName", column = "db_name"),
            @Result(property = "dbIp", column = "db_ip"),
            @Result(property = "dbPort", column = "db_port"),
            @Result(property = "dbUser", column = "db_user"),
            @Result(property = "dbPasswd", column = "db_passwd"),
    })
    DBConn getById(Long id);


    @Insert("INSERT INTO db_conns(dbName, dbIp, dbPort, dbUser, dbPasswd) VALUES (#{dbName}, #{dbIp}, #{dbPort}, #{dbUser}, #{dbPasswd})")
    void insertOne(DBConn dbConn);


    @Delete("DELETE FROM db_conns WHERE id = #{id}")
    void delete(Long id);


}
