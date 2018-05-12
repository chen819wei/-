package com.xiaoyou.test;

import com.xiaoyou.domain.UserDomain;
import com.xiaoyou.jdbc.dao.dao.UserDao;
import org.junit.jupiter.api.Test;

import java.util.List;


public class UserDomainDaoTest {
    //����һ���û�
    UserDomain userDomain = new UserDomain("name", "password", "nickname", "avatar", "����",
            "university", "profession", "student_id", "��", "i am is");

    //�����û���Ϣ
    UserDao dao = new UserDao();
    @Test
    public void select(){
        UserDomain userDomain =dao.select("name");
        System.out.println(userDomain);
    }
    @Test
    public void insert(){
        int i=dao.insert(userDomain);
        System.out.println(i);
    }
    @Test
    public void selectAll(){
        List<UserDomain> userDomain =dao.selectAll();
        System.out.println(userDomain);
    }
    @Test
    public void delete(){
        int i=dao.delete("name");
        System.out.println(i);
    }
    @Test
    public void update(){
       userDomain.setUser_password("chen");
       userDomain.setUser_nickname("chen");
       userDomain.setUser_avatar("chen");
       userDomain.setProvince("����");
       userDomain.setUniversity("���");
       userDomain.setProfession("�����");
       userDomain.setStudent_id("111");
       userDomain.setSex("��");
       userDomain.setSelf_introduction("hello world");
        int i=dao.update(userDomain);
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
