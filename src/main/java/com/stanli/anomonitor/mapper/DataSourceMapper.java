package com.stanli.anomonitor.mapper;

import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;


public interface DataSourceMapper {

    @Select("SELECT * FROM information_schema.TABLES WHERE TABLE_SCHEMA=(SELECT database())")
    List<Map> listTables();

    @Select("SELECT * FROM information_schema.COLUMNS WHERE TABLE_SCHEMA = (SELECT database()) AND TABLE_NAME=#{tableName}")
    List<Map> listTableColumns(String tableName);


}
