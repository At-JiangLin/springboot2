package com.example.springboot2swagger.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * @Auther: ljl
 * @Date: 2018/12/7 11:43
 * @Description:
 */

@Data
@NoArgsConstructor // 为类提供一个无参的构造方法
@AllArgsConstructor // 为类提供一个全参的构造方法
@ApiModel("用户基本信息")
public class User implements Serializable {

    private static final long serialVersionUID = 2280430755501865621L;

    @ApiModelProperty("自增主键")
    private Long id;

    @ApiModelProperty("姓名")
    @Size(max = 20)
    @NotNull
    private String userName;

    @ApiModelProperty("电话")
    private String tel;
}
