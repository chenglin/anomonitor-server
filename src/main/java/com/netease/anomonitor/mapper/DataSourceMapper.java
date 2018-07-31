package com.netease.anomonitor.mapper;

import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;


public interface DataSourceMapper {

    @Select("select * from information_schema.TABLES where TABLE_SCHEMA=(select database())")
    List<Map> listTables();

    @Select("select * from information_schema.COLUMNS where TABLE_SCHEMA = (select database()) and TABLE_NAME=#{tableName}")
    List<Map> listTableColumns(String tableName);


}
