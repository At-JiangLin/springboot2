package com.example.springboot2log4j2.controller;

import com.example.springboot2log4j2.entity.User;
import com.example.springboot2log4j2.service.UserService;
import com.example.springboot2log4j2.service.impl.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: ljl
 * @Date: 2018/12/6 10:38
 * @Description:
 */

@RestController
public class UserController {

    private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/user")
    public User getUser(@RequestParam(value = "id", defaultValue = "1") int id) {
        User user = userService.getUser(id);

        return user;
    }

    @RequestMapping("/getTel")
    public User getUserByTel(@RequestParam(value = "id", defaultValue = "1") int id) {
        User user = userService.getUserByTel(id);

        return user;
    }
}
