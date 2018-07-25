package com.netease.anobot.model.alert;

import javax.persistence.*;

@Entity
@Table(name = "email")
public class Email {

    @Id
    @GeneratedValue
    @Column(nullable = false)
    private Long id;
    private String name;
    @Column(name = "email_address")
    private String emailAddress;
    @Column(name = "create_time")
    private String createTime;
    @Column(name = "update_time")
    private String updateTime;

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

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
}
