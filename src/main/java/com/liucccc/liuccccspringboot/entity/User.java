package com.liucccc.liuccccspringboot.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "用户实体类")
@Data
public class User {
    @ApiModelProperty(value = "用户唯一标识", example = "123")
    private Long id;

    @ApiModelProperty(value = "用户姓名")
    private String username;

    @ApiModelProperty(value = "用户密码")
    private String password;

    @ApiModelProperty(value = "用户年龄", example = "123")
    private Integer age;
}
