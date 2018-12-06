package com.example.springboot2mybatisplus.service;

import com.example.springboot2mybatisplus.entity.User;

/**
 * @Auther: ljl
 * @Date: 2018/12/5 14:36
 * @Description:
 */

public interface UserService {
    User getUser(int id);

    User getUserByTel(int id);
}
