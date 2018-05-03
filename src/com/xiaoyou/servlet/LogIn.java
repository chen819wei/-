package com.xiaoyou.servlet;

import com.xiaoyou.jdbc.dao.impl.UserDaoImpl;
import com.xiaoyou.jdbc.domain.User;

import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;


public class LogIn extends HttpServlet {

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws IOException {
        response.setCharacterEncoding("UTF-8");
        response.setHeader("content-type","text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        String user_name=request.getParameter("username");
        String user_password=request.getParameter("password");
        UserDaoImpl dao = new UserDaoImpl();
        User user=dao.select(user_name);
        if(user!=null){
            if (user_name.equals(user.getUser_name() )&& user_password.equals(user.getUser_password())) {
                System.out.println("登录成功");
                out.println("登陆成功");

            }else {
                System.out.println("密码错误");
                out.println("密码错误");
            }
        }else {
            System.out.println("账户名不存在");
            out.println("账户名不存在");
        }

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)   {

    }
}
