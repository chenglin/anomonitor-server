package com.netease.anomonitor.mapper;

import com.netease.anomonitor.entity.DataSource;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;


public interface DataSourceMapper {

    @Insert("INSERT INTO data_source (db_name, db_ip, db_port, db_user, db_passwd) VALUES (#{dbName}, #{dbIp}, #{dbPort}, #{dbUser}, #{dbPasswd})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    Integer insertOne(DataSource dataSource);

    @Select("SELECT * FROM information_schema.TABLES WHERE TABLE_SCHEMA=(SELECT database())")
    List<Map> listTables();

    @Select("SELECT * FROM information_schema.COLUMNS WHERE TABLE_SCHEMA = (SELECT database()) AND TABLE_NAME=#{tableName}")
    List<Map> listTableColumns(String tableName);

    @Select("SELECT * FROM data_source WHERE id = #{id}")
    @Results({
            @Result(property = "dbName", column = "db_name"),
            @Result(property = "dbIp", column = "db_ip"),
            @Result(property = "dbPort", column = "db_port"),
            @Result(property = "dbUser", column = "db_user"),
            @Result(property = "dbPasswd", column = "db_passwd")
    })
    DataSource getById(Integer id);

}
