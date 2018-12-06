package com.example.springboot2log4j2.service;

import com.example.springboot2log4j2.entity.User;

/**
 * @Auther: ljl
 * @Date: 2018/12/6 10:33
 * @Description:
 */
public interface UserService {
    User getUser(int id);

    User getUserByTel(int id);
}
