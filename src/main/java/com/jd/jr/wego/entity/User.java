package com.jd.jr.wego.entity;

import lombok.Data;

/**
 * @Author quanhangbo
 * @Date 2021/1/4 18:06
 */
@Data
public class User {

    private String userId;
    private String nickname;
    private String password;
    private String salt;
    private String avatar;
    private int achieveValue;
    private String userIp;
}
