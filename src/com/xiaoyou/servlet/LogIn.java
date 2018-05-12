package com.xiaoyou.servlet;

import com.xiaoyou.jdbc.dao.impl.UserDaoImpl;
import com.xiaoyou.domain.User;

import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

/*
*登陆接口
* */
public class LogIn extends HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        System.out.println("dopost执行");
        UserDaoImpl dao = new UserDaoImpl();
        User user = dao.select(request.getParameter("user_name"));
        System.out.println(user);
        if (user != null) {
            if (request.getParameter("user_name").equals(user.getUser_name()) && request.getParameter("user_password").equals(user.getUser_password())) {
                System.out.println("登录成功");
                out.write("{\"onSuccess\":\"登录成功\"}");
                out.close();
            } else {
                System.out.println("密码错误");
                out.write("{\"onSuccess\":\"密码错误\"}");
                out.close();
            }
        } else {
            System.out.println("账户名不存在");
            out.write("{\"onSuccess\":\"账户名不存在\"}");
            out.close();
        }


    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws IOException {
        doPost(request, response);
    }
}
