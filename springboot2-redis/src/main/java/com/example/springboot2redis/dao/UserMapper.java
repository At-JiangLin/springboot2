package com.example.springboot2redis.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springboot2redis.entity.User;

/**
 * @Auther: ljl
 * @Date: 2018/12/6 17:53
 * @Description:
 */
public interface UserMapper extends BaseMapper<User> {
    String selectUserByTel(Long id);
}
