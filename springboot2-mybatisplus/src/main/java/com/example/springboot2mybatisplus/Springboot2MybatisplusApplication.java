package com.example.springboot2mybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.springboot2mybatisplus.dao")
public class Springboot2MybatisplusApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot2MybatisplusApplication.class, args);
    }
}
