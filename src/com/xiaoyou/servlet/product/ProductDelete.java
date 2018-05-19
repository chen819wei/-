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

@WebServlet(urlPatterns = {"/ProductDelete"},name = "ProductDelete")
public class ProductDelete extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        ProductDao product_dao = new ProductDao();
        ProductDomain product_domain=product_dao.productSelect(Integer.parseInt(request.getParameter("product_release_id")));
        if (product_domain.getUser_name().equals(request.getParameter("user_name"))) {
            int i = product_dao.productDelete(Integer.parseInt(request.getParameter("product_release_id")));
            if (i == 0) {
                out.write("{\"delete\":0,\"message\":\"商品删除成功\"}");
                out.close();
            } else {
                out.write("{\"delete\":1,\"message\":\"商品删除失败\"}");
                out.close();
            }
        } else {
            out.write("{\"delete\":1,\"message\":\"商品不属于该用户\"}");
            out.close();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
