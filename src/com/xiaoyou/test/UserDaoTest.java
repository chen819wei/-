package com.xiaoyou.test;

import com.xiaoyou.jdbc.dao.impl.UserDaoImpl;
import com.xiaoyou.domain.User;
import org.junit.jupiter.api.Test;

import java.util.List;


public class UserDaoTest {
    //����һ���û�
    User user = new User("name", "password", "nickname", "avatar", "����",
            "university", "profession", "student_id", "��", "i am is");

    //�����û���Ϣ
    UserDaoImpl dao = new UserDaoImpl();
    @Test
    public void select(){
        User user=dao.select("name");
        System.out.println(user);
    }
    @Test
    public void insert(){
        int i=dao.insert(user);
        System.out.println(i);
    }
    @Test
    public void selectAll(){
        List<User> user=dao.selectAll();
        System.out.println(user);
    }
    @Test
    public void delete(){
        int i=dao.delete("name");
        System.out.println(i);
    }
    @Test
    public void update(){
       user.setUser_password("chen");
       user.setUser_nickname("chen");
       user.setUser_avatar("chen");
       user.setProvince("����");
       user.setUniversity("���");
       user.setProfession("�����");
       user.setStudent_id("111");
       user.setSex("��");
       user.setSelf_introduction("hello world");
        int i=dao.update(user);
        System.out.println(user);
        System.out.println(i);
    }

    public UserDaoTest() {
        //List<User> u=dao.selectAll();
        //User u=dao.select(user.getUser_name());
       //dao.insert(user);
        //System.out.println(u);
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
