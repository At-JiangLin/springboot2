package com.example.springboot2redis.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Auther: ljl
 * @Date: 2018/12/6 17:50
 * @Description:
 */

@Data
public class User implements Serializable {

    private static final long serialVersionUID = -6321459787612028892L;

    private Long id;
    private String userName;
    private String tel;
}
