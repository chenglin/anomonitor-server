package com.netease.anomonitor.datasource;

import com.alibaba.druid.pool.DruidDataSource;
import com.netease.anomonitor.entity.DataSource;
import com.netease.anomonitor.dto.TableColumn;
import com.netease.anomonitor.entity.DataSource;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DynamicDataSourceDelegate {

    private static String TABLE_NAME = "TABLE_NAME";
    private static String COLUMN_NAME = "COLUMN_NAME";
    private static String DATA_TYPE = "DATA_TYPE";

    public DynamicDataSourceDelegate() {}

    public static void setDataSource(DataSource ds) {
        DruidDataSource dataSource = DataSourceFactory.getInstance().newDataSource(ds);
        Map<Object, Object> dataSourceMap = DynamicDataSource.getInstance().getDataSourceMap();
        String dataSourceName = generateDataSourceName(ds.getDbName());
        dataSourceMap.put(dataSourceName, dataSource);
        DynamicDataSource.getInstance().setTargetDataSources(dataSourceMap);
        DataSourceContextHolder.setDBType(dataSourceName);
    }

    private static String generateDataSourceName(String dbName) {
        StringBuilder name = new StringBuilder();
        name.append("datasource");
        name.append("_");
        name.append(dbName);
        return name.toString();
    }

    public static String generateMySQLUrl(DataSource ds) {
        StringBuilder url = new StringBuilder();
        url.append("jdbc:mysql://");
        url.append(ds.getDbIp());
        url.append(":");
        url.append(ds.getDbPort());
        url.append("/");
        url.append(ds.getDbName());
        url.append("?characterEncoding=utf-8&zeroDateTimeBehavior=convertToNull");
        return url.toString();
    }

    public static List<String> getTableDescValues(List<Map> maps) {
        List<String> values = new ArrayList<>();
        for (int i = 0; i < maps.size(); i++) {
            Map tableMap = maps.get(i);
            String tableName = (String) tableMap.get(TABLE_NAME);
            values.add(tableName);
        }
        return values;
    }

    public static List<TableColumn> getTableColumnDescValue(List<Map> maps) {
        List<TableColumn> values = new ArrayList<>();
        for (int i = 0; i < maps.size(); i++) {
            Map map = maps.get(i);
            TableColumn tableColumn = new TableColumn((String) map.get(COLUMN_NAME), (String) map.get(DATA_TYPE));
            values.add(tableColumn);
        }
        return values;
    }

}
