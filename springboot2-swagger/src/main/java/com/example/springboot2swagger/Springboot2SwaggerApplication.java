package com.example.springboot2swagger;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@MapperScan("com.example.springboot2swagger.dao")
@EnableCaching
@PropertySource(value = {"classpath:swagger.properties"})
@EnableSwagger2Doc
public class Springboot2SwaggerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot2SwaggerApplication.class, args);
    }
}
