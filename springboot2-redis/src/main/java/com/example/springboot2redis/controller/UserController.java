package com.example.springboot2redis.controller;

import com.example.springboot2redis.entity.User;
import com.example.springboot2redis.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: ljl
 * @Date: 2018/12/7 09:34
 * @Description:
 */

@RestController
public class UserController {

    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/user")
    public User getUser(@RequestParam(value = "id", defaultValue = "1") Long id) {
        User user = userService.getUser(id);

        return user;
    }

    @RequestMapping("/getTel")
    public String getUserByTel(@RequestParam(value = "id", defaultValue = "1") Long id) {
        String user = userService.getUserByTel(id);

        return user;
    }
}
