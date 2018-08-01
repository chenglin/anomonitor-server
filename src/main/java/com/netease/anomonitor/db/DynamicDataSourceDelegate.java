package com.netease.anomonitor.db;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DynamicDataSourceDelegate {

    public static String generateDataSourceName(String dbName) {
        StringBuilder name = new StringBuilder();
        name.append("datasource");
        name.append("_");
        name.append(dbName);
        return name.toString();
    }

    public static List<String> getTableDescValues(List<Map> map, String keyName) {
        List<String> values = new ArrayList<>();
        for (int i = 0; i < map.size(); i++) {
            Map tableMap = map.get(i);
            String tableName = (String) tableMap.get(keyName);
            values.add(tableName);
        }
        return values;
    }
}
