package com.yanghz.shopuser.model;

import lombok.Data;
/**
 * @author yanghangzheng
 * @date 2019/6/27 16:14
 */

@Data
public class User {

    private Integer id;
    private String name;
    private Integer age;
    private String password;
    private String sex;
    private String email;
    private String telephone;
    private String birthday;
    private String address;
    private String qq;
    private String wechat;
    private String account;

}
