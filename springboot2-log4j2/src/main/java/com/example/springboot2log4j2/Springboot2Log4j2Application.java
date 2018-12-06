package com.example.springboot2log4j2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.springboot2log4j2.dao")
public class Springboot2Log4j2Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot2Log4j2Application.class, args);
    }
}
