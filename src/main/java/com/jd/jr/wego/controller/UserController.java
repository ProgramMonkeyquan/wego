package com.jd.jr.wego.controller;

import com.jd.jr.wego.entity.User;
import com.jd.jr.wego.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author quanhangbo
 * @Date 2020/12/7 15:10
 */
@Controller
public class UserController {

    @Autowired
    IUserService userService;

    @RequestMapping("/register")
    public String insertUser(){
        User user = new User();
        user.setUserId("18392710807");
        user.setNickname("代码,出来挨打");
        user.setPassword("welcome2021");
        user.setSalt("wego");
        user.setUserIp("192.168.1.12");
        userService.insertUser(user);
        return "login";
    }
}
