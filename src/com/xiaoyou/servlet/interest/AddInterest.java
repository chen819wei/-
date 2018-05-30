package com.xiaoyou.servlet.interest;

import com.xiaoyou.dao.interest.InterestDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "AddInterest",urlPatterns = {"/AddInterest"})
public class AddInterest extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        int i = new InterestDao().addInterest(Integer.parseInt(request.getParameter("user_id")), Integer.parseInt(request.getParameter("interest_label_id")));
        if (i == 0) {
            out.write("{\"addInterest\":0,\"message\":\"��ӱ�ǩ�ɹ�\"}");
            out.close();
        } else {
            out.write("{\"addInterest\":1,\"message\":\"��ӱ�ǩʧ��\"}");
            out.close();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
