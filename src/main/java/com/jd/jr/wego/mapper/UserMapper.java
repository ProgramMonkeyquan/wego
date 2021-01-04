package com.jd.jr.wego.mapper;

import com.jd.jr.wego.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author quanhangbo
 * @Date 2021/1/4 18:11
 */
@Mapper
public interface UserMapper {

    String TABLE_NAME = " user ";
    String INSERT_VALUE = " user_id, nickname, password, salt, avatar, achieve_value, user_ip ";
    String SELECT_VALUE = INSERT_VALUE;

    @Insert("insert into " + TABLE_NAME + "(" + INSERT_VALUE + ") values(#{userId},#{nickname}, #{password}, #{salt}" +
                ",#{avatar}, #{achieveValue}, #{userIp})")
    void insertUser(User user);
}
