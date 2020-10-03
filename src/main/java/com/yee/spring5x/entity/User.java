package com.yee.spring5x.entity;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @author yusheng
 * @version 1.0.0
 * @datetime 2020/10/3 13:08
 */
public class User implements Serializable {

    @ApiModelProperty(value = "用户名")
    private String userName;

    @ApiModelProperty(value = "密码")
    private String pwd;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

}
