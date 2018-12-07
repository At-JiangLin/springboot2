package com.example.springboot2swagger.service.impl;

import com.example.springboot2swagger.dao.UserMapper;
import com.example.springboot2swagger.entity.User;
import com.example.springboot2swagger.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @Auther: ljl
 * @Date: 2018/12/7 11:50
 * @Description:
 */

@Service
public class UserServiceImpl implements UserService {

    private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserMapper userMapper;

    @Override
    @Cacheable(value = "user", key = "#id")
    public User getUser(Long id) {
        User user = userMapper.selectById(id);

        return user;
    }

    @Override
    public String getUserByTel(Long id) {
        String tel  = userMapper.selectUserByTel(id);

        return tel;
    }
}
