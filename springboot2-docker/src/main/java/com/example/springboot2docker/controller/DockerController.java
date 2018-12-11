package com.example.springboot2docker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: ljl
 * @Date: 2018/12/10 10:34
 * @Description:
 */

@RestController
public class DockerController {

    @RequestMapping(value = "/")
    public String index() {
        return "Hello Docker";
    }
}
