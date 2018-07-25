package com.netease.anobot.repository;

import com.netease.anobot.entity.QuerySettings;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QueryTaskRepository extends CrudRepository<QuerySettings, Long> {

}
