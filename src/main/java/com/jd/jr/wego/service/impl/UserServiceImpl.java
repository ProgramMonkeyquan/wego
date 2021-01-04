package com.jd.jr.wego.service.impl;

import com.jd.jr.wego.entity.User;
import com.jd.jr.wego.mapper.UserMapper;
import com.jd.jr.wego.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author quanhangbo
 * @Date 2021/1/4 18:11
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired(required = false)
    private UserMapper userMapper;

    @Override
    public void insertUser(User user) {
        userMapper.insertUser(user);
    }
}
