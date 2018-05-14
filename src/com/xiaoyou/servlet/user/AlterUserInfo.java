package com.xiaoyou.servlet.user;

import com.xiaoyou.domain.user.UserDomain;
import com.xiaoyou.jdbc.dao.dao.user.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "AlterUserInfo")
public class AlterUserInfo extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        UserDao dao = new UserDao();
        UserDomain userDomain = new UserDomain();
        //UserDomain userDomain = dao.select(request.getParameter("user_name"));
        //System.out.println(userDomain);
     /*   if (userDomain != null) {
            if (request.getParameter("user_password").equals(userDomain.getUser_password())) {*/
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
                int i = dao.update(userDomain);
                if (i == 0) {
                    out.write("{\"alter\":\"0\",\"message\":\"ÐÞ¸Ä³É¹¦\"}");
                    out.close();
                } else {
                    out.write("{\"alter\":\"1\",\"message\":\"ÐÞ¸ÄÊ§°Ü\"}");
                    out.close();
                }
            /*} else {
                out.write("{\"alter\":1,\"message\":\"ÃÜÂë´íÎó\"}");
                out.close();
            }
        } else {
            out.write("{\"alter\":1,\"message\":\"ÕËºÅ²»´æÔÚ\"}");
            out.close();
        }*/
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
