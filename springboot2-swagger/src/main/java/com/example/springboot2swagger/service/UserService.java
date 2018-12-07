package com.example.springboot2swagger.service;

import com.example.springboot2swagger.entity.User;

/**
 * @Auther: ljl
 * @Date: 2018/12/7 11:49
 * @Description:
 */
public interface UserService {

    User getUser(Long id);

    String getUserByTel(Long id);
}
