package com.xiaoyou.servlet.requirement;

import com.google.gson.GsonBuilder;
import com.xiaoyou.domain.requirement.RequirementDomain;
import com.xiaoyou.jdbc.dao.dao.requirement.RequirementDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "RequirementDetail")
public class RequirementDetail extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        RequirementDomain requirement_domain = new RequirementDao().requirementSelect(Integer.parseInt(request.getParameter("requirement_release_id")));
        out.write(new GsonBuilder().setPrettyPrinting().create().toJson(requirement_domain));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
