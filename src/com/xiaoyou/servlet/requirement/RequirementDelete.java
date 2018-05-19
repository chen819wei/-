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

@WebServlet(name = "RequirementDelete")
public class RequirementDelete extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        RequirementDao dao = new RequirementDao();
        RequirementDomain requirement_domain=dao.requirementSelect(Integer.parseInt(request.getParameter("requirement_release_id")));
        if (requirement_domain.getUser_name().equals(request.getParameter("user_name"))) {
            int i = dao.requirementDelete(Integer.parseInt(request.getParameter("requirement_release_id")));
            if (i == 0) {
                out.write("{\"delete\":0,\"message\":\"需求删除成功\"}");
                out.close();
            } else {
                out.write("{\"delete\":1,\"message\":\"需求删除失败\"}");
                out.close();
            }
        } else {
            out.write("{\"delete\":1,\"message\":\"需求不属于该用户\"}");
            out.close();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
