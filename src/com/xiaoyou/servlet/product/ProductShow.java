package com.xiaoyou.servlet.product;

import com.google.gson.GsonBuilder;
import com.xiaoyou.domain.product.ProductDomain;
import com.xiaoyou.jdbc.dao.dao.product.ProductDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "ProductShow")
public class ProductShow extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        List<ProductDomain> list = new ProductDao().productSelectAll();
        out.write("{\"list\":" + new GsonBuilder().setPrettyPrinting().create().toJson(list) + "}");
        out.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
