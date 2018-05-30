package com.xiaoyou.servlet.user;

import com.xiaoyou.dao.user.UserDao;
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
@WebServlet(urlPatterns = {"/Registered"},name = "Registered")
public class Registered extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        UserDomain userDomain1;
        UserDao dao = new UserDao();
        userDomain1 =dao.select(request.getParameter("user_name"));
        if (userDomain1 == null) {
            UserDomain userDomain = new UserDomain(request.getParameter("user_name"), request.getParameter("user_password"), request.getParameter("user_nickname"), request.getParameter("user_avatar"), request.getParameter("province"),
                    request.getParameter("university"), request.getParameter("profession"), request.getParameter("student_id"), request.getParameter("sex"), request.getParameter("self_introduction"));
            int i = dao.insert(userDomain);
            if (i == 0) {
                out.write("{\"register\":0,\"message\":\"注册成功\"}");
                out.close();
            } else {
                out.write("{\"register\":1,\"message\":\"注册失败\"}");
                out.close();
            }
        }
        else {
            out.write("{\"register\":1,\"message\":\"注册失败,用户名已存在\"}");
           out.close();
       }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
