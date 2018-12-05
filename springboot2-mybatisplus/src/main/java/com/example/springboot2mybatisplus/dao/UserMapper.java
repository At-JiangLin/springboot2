package com.example.springboot2mybatisplus.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springboot2mybatisplus.entity.User;

/**
 * @Auther: ljl
 * @Date: 2018/12/5 14:35
 * @Description:
 */

//@Mapper // 在启动类添加@MapperScan可以免去添加@Mapper
public interface UserMapper extends BaseMapper<User> {
    User selectUserByTel(int id);
}
