package com.xiaoyou.servlet.product;

import com.xiaoyou.domain.product.ProductDomain;
import com.xiaoyou.jdbc.dao.dao.product.ProductDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * 商品发布接口
 * */
@WebServlet(name = "ProductRelease")
public class ProductRelease extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        ProductDomain product = new ProductDomain(request.getParameter("title"), Double.parseDouble(request.getParameter("price")),
                request.getParameter("description"), request.getParameter("picture"), request.getParameter("contact_name"),
                request.getParameter("phone_number"), request.getParameter("address"), Integer.parseInt(request.getParameter("product_category_id")),
                request.getParameter("user_name"));
        int i = new ProductDao().productRelease(product);
        if (i == 0) {
            out.write("{\"release\":0,\"message\":\"商品发布成功\"}");
            out.close();
        } else {
            out.write("{\"release\":1,\"message\":\"商品发布失败\"}");
            out.close();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
