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

@WebServlet(urlPatterns = {"/ProductDetails"},name = "ProductDetails")
public class ProductDetails extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        ProductDomain product_domain = new ProductDao().productSelect(Integer.parseInt(request.getParameter("product_release_id")));
       out.write(new GsonBuilder().setPrettyPrinting().create().toJson(product_domain));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
