package com.xiaoyou.jdbc.dao.test;

import com.xiaoyou.jdbc.dao.impl.UserDaoImpl;
import com.xiaoyou.jdbc.domain.User;


public class UserDaoTest {
    //����һ���û�
    User user = new User("name", "password", "nickname", "avatar", "����",
            "university", "profession", "student_id", "��", "i am is");

    //�����û���Ϣ
    UserDaoImpl dao = new UserDaoImpl();

    public UserDaoTest() {
        //List<User> u=dao.selectAll();
        User u=dao.select(user.getUser_name());
       //dao.insert(user);
        System.out.println(u);
        //dao.delete(user.getUser_name());
        //System.out.println(user);
       //user.setUser_name("��ΰ");
//       user.setUser_password("chen");
//       user.setUser_nickname("chen");
//       user.setUser_avatar("chen");
//       user.setProvince("����");
//       user.setUniversity("���");
//       user.setProfession("�����");
//       user.setStudent_id("111");
//       user.setSex("��");
//       user.setSelf_introduction("hello world");
//       System.out.println(user);
//       dao.update(user);

    }

}
