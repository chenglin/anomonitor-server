package com.netease.anomonitor.repository;

import com.netease.anomonitor.entity.alert.Email;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailRepository extends CrudRepository<Email, Long> {
}
