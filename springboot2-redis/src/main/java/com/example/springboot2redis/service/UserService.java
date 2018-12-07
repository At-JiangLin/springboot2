package com.example.springboot2redis.service;

import com.example.springboot2redis.entity.User;

/**
 * @Auther: ljl
 * @Date: 2018/12/6 17:58
 * @Description:
 */
public interface UserService {
    User getUser(Long id);

    String getUserByTel(Long id);
}
