package com.example.springboot2swagger.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springboot2swagger.entity.User;

/**
 * @Auther: ljl
 * @Date: 2018/12/7 11:44
 * @Description:
 */
public interface UserMapper extends BaseMapper<User> {

    String selectUserByTel(Long id);
}
