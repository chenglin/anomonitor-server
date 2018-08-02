package com.stanli.anomonitor;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.stanli.anomonitor.mapper")
@EnableSwagger2
@EnableScheduling
public class AnomonitorApplication {


    public static void main(String args[]) {
        SpringApplication.run(AnomonitorApplication.class, args);
    }

}
