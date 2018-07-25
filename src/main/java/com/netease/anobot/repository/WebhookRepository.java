package com.netease.anobot.repository;

import com.netease.anobot.model.alert.Webhook;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WebhookRepository extends CrudRepository<Webhook, Long> {
}
