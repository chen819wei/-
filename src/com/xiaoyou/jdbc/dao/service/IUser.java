package com.xiaoyou.jdbc.dao.service;

import com.xiaoyou.domain.UserDomain;

import java.util.List;

public interface IUser {
    //1、添加用户
    int insert(UserDomain userDomain);

    //2、修改修改用户信息
    int update(UserDomain userDomain);

    //3、删除用户
    int delete(String user_name);

    //4、查询用户
    UserDomain select(String user_name);

    //5、查询所有用户
    List<UserDomain> selectAll();
}
