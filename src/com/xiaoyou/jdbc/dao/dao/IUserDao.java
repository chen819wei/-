package com.xiaoyou.jdbc.dao.dao;

import com.xiaoyou.jdbc.domain.User;

import java.util.List;

public interface IUserDao {
    //1、添加用户
    int insert(User user);

    //2、修改修改用户信息
    int update(User user);

    //3、删除用户
    int delete(String user_name);

    //4、查询用户
    User select(String user_name);

    //5、查询所有用户
    List<User> selectAll();
}
