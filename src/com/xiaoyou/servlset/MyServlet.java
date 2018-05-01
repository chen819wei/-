package com.xiaoyou.servlset;

import com.xiaoyou.jdbc.dao.test.UserDaoTest;
import java.io.IOException;

public class MyServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        UserDaoTest daoTest=new UserDaoTest();
        //System.out.println("doGet÷¥––≥…π¶");
    }
}
