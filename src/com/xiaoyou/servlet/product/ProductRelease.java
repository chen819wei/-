package com.xiaoyou.servlet.product;

import com.xiaoyou.domain.product.ProductDomain;
import com.xiaoyou.jdbc.dao.dao.product.ProductDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
/*
* ��Ʒ�����ӿ�
* */
@WebServlet(name = "ProductRelease")
public class ProductRelease extends HttpServlet {
    ProductDomain product = new ProductDomain();
    ProductDao dao = new ProductDao();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        product.setPirce(Double.parseDouble(request.getParameter("product_price")));
        product.setTitle(request.getParameter("product_title"));
        product.setDescription(request.getParameter("product_description"));
        product.setPicture(request.getParameter("product_image"));
        product.setContact_name(request.getParameter("contact_name"));
        product.setPhone_number(request.getParameter("contact_phone_number"));
        product.setAddress(request.getParameter("contact_address"));
        product.setProduct_category_id(Integer.parseInt(request.getParameter("product_category_id")));
        product.setUser_name(request.getParameter("user_name"));
        int i=dao.productRelease(product);
        if (i == 0) {
            out.write("{\"release\":0,\"message\":\"��Ʒ�����ɹ�\"}");
            out.close();
        }else {
            out.write("{\"release\":1,\"message\":\"��Ʒ����ʧ��\"}");
            out.close();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
