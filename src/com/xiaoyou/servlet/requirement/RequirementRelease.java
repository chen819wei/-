package com.xiaoyou.servlet.requirement;

import com.xiaoyou.domain.requirement.RequirementDomain;
import com.xiaoyou.jdbc.dao.dao.requirement.RequirementDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/RequirementRelease"},name = "RequirementRelease")
public class RequirementRelease extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        RequirementDomain requirement_domain = new RequirementDomain(request.getParameter("title"), Double.parseDouble(request.getParameter("price")),
                request.getParameter("description"), request.getParameter("picture"), request.getParameter("contact_name"),
                request.getParameter("phone_number"), request.getParameter("address"), Integer.parseInt(request.getParameter("requirement_category_id")),
                request.getParameter("user_name"));
        int i = new RequirementDao().requirementRelease(requirement_domain);
        if (i == 0) {
            out.write("{\"release\":0,\"message\":\"需求发布成功\"}");
            out.close();
        } else {
            out.write("{\"release\":1,\"message\":\"需求发布失败\"}");
            out.close();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
