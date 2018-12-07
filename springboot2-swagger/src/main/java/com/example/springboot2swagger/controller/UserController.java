package com.example.springboot2swagger.controller;

import com.example.springboot2swagger.entity.User;
import com.example.springboot2swagger.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: ljl
 * @Date: 2018/12/7 11:59
 * @Description:
 */

@Api(tags = "用户管理")
@RestController
public class UserController {

    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @ApiOperation("查询用户")
    @PostMapping("/user")
    public User getUser(@RequestParam(value = "id", defaultValue = "1") Long id) {
        User user = userService.getUser(id);

        return user;
    }

    @ApiOperation("查询用户电话")
    @PostMapping("/getTel")
    public String getUserByTel(@RequestParam(value = "id", defaultValue = "1") Long id) {
        String user = userService.getUserByTel(id);

        return user;
    }
}
