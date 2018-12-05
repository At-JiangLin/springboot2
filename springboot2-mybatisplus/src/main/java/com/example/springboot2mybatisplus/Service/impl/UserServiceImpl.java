package com.example.springboot2mybatisplus.Service.impl;

import com.example.springboot2mybatisplus.Service.UserService;
import com.example.springboot2mybatisplus.dao.UserMapper;
import com.example.springboot2mybatisplus.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: ljl
 * @Date: 2018/12/5 14:37
 * @Description:
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUser(int id) {
        User user = userMapper.selectById(id);

        return user;
    }

    @Override
    public User getUserByTel(int id) {
        User user = userMapper.selectUserByTel(id);

        return user;
    }
}
