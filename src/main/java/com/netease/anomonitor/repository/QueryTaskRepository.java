package com.netease.anomonitor.repository;

import com.netease.anomonitor.entity.QuerySettings;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QueryTaskRepository extends CrudRepository<QuerySettings, Long> {

}
