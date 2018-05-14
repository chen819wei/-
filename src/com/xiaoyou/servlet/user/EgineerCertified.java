package com.xiaoyou.servlet.user;

import com.google.gson.GsonBuilder;
import com.xiaoyou.domain.user.EngineerDomain;
import com.xiaoyou.jdbc.dao.dao.user.EngineerDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "EgineerCertified")
public class EgineerCertified extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        EngineerDao dao = new EngineerDao();
        List<EngineerDomain> list = dao.engineerCertified(request.getParameter("user_name"));
        out.write("{\"list\":" + new GsonBuilder().setPrettyPrinting().create().toJson(list) + "}");
        out.close();

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
