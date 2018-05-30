package com.xiaoyou.servlet.user;

import com.xiaoyou.domain.user.EngineerDomain;
import com.xiaoyou.dao.user.EngineerDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/EngineerRequest"},name = "EngineerRequest")
public class EngineerRequest extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        EngineerDomain engineer_domain = new EngineerDomain(request.getParameter("user_name"),Integer.parseInt(request.getParameter(
                "skill_id")) , request.getParameter("certified_image"));
        int i = new EngineerDao().engineerRequest(engineer_domain);
        if (i == 0) {
            out.write("{\"certified\":0,\"message\":\"提交信息成功\"}");
            out.close();
        } else {
            out.write("{\"certified\":1,\"message\":\"提交信息失败\"}");
            out.close();
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
