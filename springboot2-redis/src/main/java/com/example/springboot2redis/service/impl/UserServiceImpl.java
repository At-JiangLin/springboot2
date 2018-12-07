package com.example.springboot2redis.service.impl;

import com.example.springboot2redis.dao.UserMapper;
import com.example.springboot2redis.entity.User;
import com.example.springboot2redis.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @Auther: ljl
 * @Date: 2018/12/6 17:59
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
        String tel = userMapper.selectUserByTel(id);

        return tel;
    }
}
