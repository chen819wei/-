package com.xiaoyou.servlet;

import com.xiaoyou.jdbc.dao.impl.UserDaoImpl;
import com.xiaoyou.jdbc.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * 注册接口
 * */
@WebServlet(name = "Registered")
public class Registered extends HttpServlet {
    User user = new User();
    UserDaoImpl dao = new UserDaoImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        user=dao.select(request.getParameter("user_name"));
        if (user == null) {
            user.setUser_name(request.getParameter("user_name"));
            user.setUser_password(request.getParameter("user_password"));
            user.setUser_nickname(request.getParameter("user_nickname"));
            user.setUser_avatar(request.getParameter("user_avatar"));
            user.setProvince(request.getParameter("province"));
            user.setUniversity(request.getParameter("university"));
            user.setProfession(request.getParameter("profession"));
            user.setStudent_id(request.getParameter("student_id"));
            user.setSex(request.getParameter("sex"));
            user.setSelf_introduction(request.getParameter("self_introduction"));
            int i = dao.insert(user);
            if (i == 0) {
                out.write("{\"register\":0,\"message\":\"注册成功\"}");
                out.close();
            } else {
                out.write("{\"register\":1,\"message\":\"注册失败\"}");
                out.close();
            }
        } else {
            out.write("{\"register\":1,\"message\":\"注册失败,用户名已存在\"}");
            out.close();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
