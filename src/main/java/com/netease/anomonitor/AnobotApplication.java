package com.netease.anomonitor;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.netease.anomonitor.mapper")
public class AnobotApplication {

    public static void main(String args[]) {
        SpringApplication.run(AnobotApplication.class, args);
    }

}
