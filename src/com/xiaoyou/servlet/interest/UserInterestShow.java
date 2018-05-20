package com.xiaoyou.servlet.interest;

import com.google.gson.GsonBuilder;
import com.xiaoyou.jdbc.dao.dao.interest.InterestDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "UserInterestShow", urlPatterns = "/UserInterestShow")
public class UserInterestShow extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        //输出格式化的json字符串
        out.write("{\"list\":" + new GsonBuilder().setPrettyPrinting().create().toJson(
                new InterestDao().userInterestShow(Integer.parseInt(request.getParameter("user_id"))).toArray()) + "}");
        out.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
