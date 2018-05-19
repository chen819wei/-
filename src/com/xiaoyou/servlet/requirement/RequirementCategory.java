package com.xiaoyou.servlet.requirement;

import com.google.gson.GsonBuilder;
import com.xiaoyou.domain.requirement.RequirementCategoryDomain;
import com.xiaoyou.jdbc.dao.dao.requirement.RequirementCategoryDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "RequirementCategory")
public class RequirementCategory extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        List<RequirementCategoryDomain> list = new RequirementCategoryDao().selectAllRequirementCategory();
        //输出格式化的json字符串
       /* Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String category = gson.toJson(list);
        String json="{\"list\":"+category+"}";
        out.write(new Gson().toJson(list));
         out.print(new Gson().toJson(list));      */
        out.write("{\"list\":"+new GsonBuilder().setPrettyPrinting().create().toJson(list)+"}");
        out.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}