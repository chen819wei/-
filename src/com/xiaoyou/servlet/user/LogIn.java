package com.xiaoyou.servlet.user;

import com.xiaoyou.jdbc.dao.dao.user.UserDao;
import com.xiaoyou.domain.user.UserDomain;

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
        UserDomain userDomain = new UserDao().select(request.getParameter("user_name"));
        if (userDomain != null) {
            if (request.getParameter("user_name").equals(userDomain.getUser_name()) && request.getParameter("user_password").equals(userDomain.getUser_password())) {
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
