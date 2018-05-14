package com.xiaoyou.servlet.user;

import com.google.gson.GsonBuilder;
import com.xiaoyou.domain.UserDomain;
import com.xiaoyou.jdbc.dao.dao.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "UserInfoView")
public class UserInfoView extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        UserDao dao=new UserDao();
        UserDomain userDomain =dao.select(request.getParameter("user_name"));
        out.write(new GsonBuilder().setPrettyPrinting().create().toJson(userDomain));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
