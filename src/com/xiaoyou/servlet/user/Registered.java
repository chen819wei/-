package com.xiaoyou.servlet.user;

import com.xiaoyou.jdbc.dao.dao.user.UserDao;
import com.xiaoyou.domain.user.UserDomain;

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
    UserDomain userDomain = new UserDomain();
    UserDao dao = new UserDao();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        userDomain =dao.select(request.getParameter("user_name"));
        if (userDomain == null) {
            userDomain.setUser_name(request.getParameter("user_name"));
            userDomain.setUser_password(request.getParameter("user_password"));
            userDomain.setUser_nickname(request.getParameter("user_nickname"));
            userDomain.setUser_avatar(request.getParameter("user_avatar"));
            userDomain.setProvince(request.getParameter("province"));
            userDomain.setUniversity(request.getParameter("university"));
            userDomain.setProfession(request.getParameter("profession"));
            userDomain.setStudent_id(request.getParameter("student_id"));
            userDomain.setSex(request.getParameter("sex"));
            userDomain.setSelf_introduction(request.getParameter("self_introduction"));
            int i = dao.insert(userDomain);
            if (i == 0) {
                out.write("{\"register\":\"0\",\"message\":\"注册成功\"}");
                out.close();
            } else {
                out.write("{\"register\":\"1\",\"message\":\"注册失败\"}");
                out.close();
            }
        } else {
            out.write("{\"register\":\"1\",\"message\":\"注册失败,用户名已存在\"}");
            out.close();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
