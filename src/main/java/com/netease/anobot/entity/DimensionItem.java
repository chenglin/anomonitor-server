package com.netease.anobot.entity;

import javax.persistence.*;

@Entity
@Table(name = "dimension_item")
public class DimensionItem {
    @Id
    @GeneratedValue
    @Column(nullable = false)
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}