package com.xiaoyou.test;

import com.google.gson.GsonBuilder;
import com.xiaoyou.domain.user.UserDomain;
import com.xiaoyou.jdbc.dao.dao.user.UserDao;
import org.junit.jupiter.api.Test;

import java.util.List;


public class UserDomainDaoTest {
    //����һ���û�
    UserDomain userDomain = new UserDomain("name", "password", "nickname", "avatar", "����",
            "university", "profession", "student_id", "��", "i am is");
    UserDomain userDomain1 = new UserDomain();
    //�����û���Ϣ
    UserDao dao = new UserDao();

    @Test
    public void select() {
        UserDomain userDomain = dao.select("user_name");
        System.out.println(new GsonBuilder().setPrettyPrinting().create().toJson(userDomain));
    }

    @Test
    public void insert() {
        userDomain1 = dao.select("user");
        if (userDomain1 == null) {
            System.out.println(userDomain1);

            System.out.println(1);
        }else {
            System.out.println("cuowu");
        }
    }

    @Test
    public void selectAll() {
        List<UserDomain> userDomain = dao.selectAll();
        System.out.println(userDomain);
    }

    @Test
    public void delete() {
        int i = dao.delete("name");
        System.out.println(i);
    }

    @Test
    public void update() {
        userDomain.setUser_password("chen");
        userDomain.setUser_nickname("chen");
        userDomain.setUser_avatar("chen");
        userDomain.setProvince("����");
        userDomain.setUniversity("���");
        userDomain.setProfession("�����");
        userDomain.setStudent_id("111");
        userDomain.setSex("��");
        userDomain.setSelf_introduction("hello world");
        int i = dao.update(userDomain);
        System.out.println(userDomain);
        System.out.println(i);
    }

    public UserDomainDaoTest() {
        //List<UserDomain> u=service.selectAll();
        //UserDomain u=service.select(userDomain.getUser_name());
        //service.insert(userDomain);
        //System.out.println(u);
        //service.delete(userDomain.getUser_name());
        //System.out.println(userDomain);
        //userDomain.setUser_name("��ΰ");
//       userDomain.setUser_password("chen");
//       userDomain.setUser_nickname("chen");
//       userDomain.setUser_avatar("chen");
//       userDomain.setProvince("����");
//       userDomain.setUniversity("���");
//       userDomain.setProfession("�����");
//       userDomain.setStudent_id("111");
//       userDomain.setSex("��");
//       userDomain.setSelf_introduction("hello world");
//       System.out.println(userDomain);
//       service.update(userDomain);

    }

}
