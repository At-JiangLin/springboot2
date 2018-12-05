package com.example.springboot2mybatisplus.controller;

import com.example.springboot2mybatisplus.Service.UserService;
import com.example.springboot2mybatisplus.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: ljl
 * @Date: 2018/12/5 14:40
 * @Description:
 */

@RestController
public class UserController {

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
