package com.example.springboot2log4j2.service.impl;

import com.example.springboot2log4j2.dao.UserMapper;
import com.example.springboot2log4j2.entity.User;
import com.example.springboot2log4j2.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: ljl
 * @Date: 2018/12/6 10:34
 * @Description:
 */

@Service
public class UserServiceImpl implements UserService {

    private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

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
