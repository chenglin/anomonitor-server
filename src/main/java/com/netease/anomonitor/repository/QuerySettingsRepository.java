package com.netease.anomonitor.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class QuerySettingsRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;
}
