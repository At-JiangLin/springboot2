package com.example.springboot2redis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan("com.example.springboot2redis.dao")
@EnableCaching
public class Springboot2RedisApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot2RedisApplication.class, args);
    }
}
