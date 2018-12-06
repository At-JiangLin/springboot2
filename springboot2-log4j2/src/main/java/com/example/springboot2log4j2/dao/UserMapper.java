package com.example.springboot2log4j2.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springboot2log4j2.entity.User;

/**
 * @Auther: ljl
 * @Date: 2018/12/6 10:30
 * @Description:
 */
public interface UserMapper extends BaseMapper<User> {
    User selectUserByTel(int id);
}
