package com.netease.anomonitor.repository;

import com.netease.anomonitor.entity.DBConn;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DBConnRepository extends CrudRepository<DBConn, Long> {
}
