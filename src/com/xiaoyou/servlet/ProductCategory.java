package com.xiaoyou.servlet;

import com.google.gson.Gson;
import com.xiaoyou.domain.ProductCategoryDomain;
import com.xiaoyou.jdbc.dao.dao.ProductCategoryDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "ProductCategoryDomain")
public class ProductCategory extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        ProductCategoryDao product_category_dao=new ProductCategoryDao();
        List<ProductCategoryDomain> list= product_category_dao.selectAllProductCategory();
        out.write(new Gson().toJson(list));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
