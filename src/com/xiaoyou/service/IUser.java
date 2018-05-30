package com.xiaoyou.service;

import com.xiaoyou.domain.user.MyCollectDomain;
import com.xiaoyou.domain.user.UserDomain;

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

    //商品或者需求收藏
    int collection(MyCollectDomain my_collect);

    //查看自己的收藏
    List<MyCollectDomain> userCollectionShow(String user_name);
}
