package com.xiaoyou.servlet.user;

import com.xiaoyou.domain.user.UserDomain;
import com.xiaoyou.dao.user.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/AlterUserInfo"},name = "AlterUserInfo")
public class AlterUserInfo extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        UserDomain userDomain = new UserDomain(request.getParameter("user_name"), request.getParameter("user_password"), request.getParameter("user_nickname"), request.getParameter("user_avatar"), request.getParameter("province"),
                request.getParameter("university"), request.getParameter("profession"), request.getParameter("student_id"), request.getParameter("sex"), request.getParameter("self_introduction"));
        int i =  new UserDao().update(userDomain);
        if (i == 0) {
            out.write("{\"alter\":0,\"message\":\"修改成功\"}");
            out.close();
        } else {
            out.write("{\"alter\":1,\"message\":\"修改失败\"}");
            out.close();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
