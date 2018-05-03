package com.xiaoyou.jdbc.dao.test;

import com.xiaoyou.jdbc.dao.impl.UserDaoImpl;
import com.xiaoyou.jdbc.domain.User;


public class UserDaoTest {
    //创建一个用户
    User user = new User("name", "password", "nickname", "avatar", "贵州",
            "university", "profession", "student_id", "男", "i am is");

    //保存用户信息
    UserDaoImpl dao = new UserDaoImpl();

    public UserDaoTest() {
        //List<User> u=dao.selectAll();
        User u=dao.select(user.getUser_name());
       //dao.insert(user);
        System.out.println(u);
        //dao.delete(user.getUser_name());
        //System.out.println(user);
       //user.setUser_name("陈伟");
//       user.setUser_password("chen");
//       user.setUser_nickname("chen");
//       user.setUser_avatar("chen");
//       user.setProvince("贵州");
//       user.setUniversity("贵大");
//       user.setProfession("计算机");
//       user.setStudent_id("111");
//       user.setSex("男");
//       user.setSelf_introduction("hello world");
//       System.out.println(user);
//       dao.update(user);

    }

}
