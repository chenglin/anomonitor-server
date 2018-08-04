package com.stanli.anomonitor.mapper;

import com.stanli.anomonitor.entity.DataSource;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;


public interface DataSourceMapper {

    @Insert("INSERT INTO data_source (db_name, db_ip, db_port, db_user, db_passwd, db_url) VALUES (#{dbName}, #{dbIp}, #{dbPort}, #{dbUser}, #{dbPasswd}, #{dbUrl})")
    void insertOne(DataSource dataSource);

    @Select("SELECT * FROM information_schema.TABLES WHERE TABLE_SCHEMA=(SELECT database())")
    List<Map> listTables();

    @Select("SELECT * FROM information_schema.COLUMNS WHERE TABLE_SCHEMA = (SELECT database()) AND TABLE_NAME=#{tableName}")
    List<Map> listTableColumns(String tableName);

    @Select("SELECT * FROM data_source WHERE id = #{id}")
    DataSource getById(Long id);

    @Select("SELECT * FROM data_source WHERE url = #{url}")
    DataSource getByUrl(String url);

}
