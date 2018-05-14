package com.xiaoyou.jdbc.dao.dao.product;

import com.xiaoyou.Util.JDBCUtil;
import com.xiaoyou.jdbc.dao.service.IProduct;
import com.xiaoyou.domain.product.ProductDomain;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ProductDao implements IProduct {
    // 定义数据库的链接
    private Connection connection = null;
    // 定义sql语句的执行对象
    private PreparedStatement pstmt = null;
    //结果集
    private ResultSet rs;

    @Override
    public int productRelease(ProductDomain product) {
        try {
            connection = JDBCUtil.getConnection();
            String insertSQL = "INSERT INTO product_release(price,title,description,picture,contact_name,phone_number,\n" +
                    "address,product_category,user_id) values(?,?,?,?,?,?,?,?,?)";
            pstmt = connection.prepareStatement(insertSQL);
            pstmt.setDouble(1, product.getPirce());
            pstmt.setString(2, product.getTitle());
            pstmt.setString(3, product.getDescription());
            pstmt.setString(4, product.getPicture());
            pstmt.setString(5, product.getContact_name());
            pstmt.setString(6, product.getPhone_number());
            pstmt.setString(7, product.getAddress());
            pstmt.setString(8, product.getProduct_category());
            pstmt.setString(9, product.getUser_name());
            pstmt.executeUpdate();
            return 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return 1;
        } finally {
            JDBCUtil.close(null, pstmt, connection);
        }

    }

    @Override
    public int productDelete(int productID) {
        connection = JDBCUtil.getConnection();
        try {
            String deleteSQL = "delete from product_release where user_name=?";
            pstmt = connection.prepareStatement(deleteSQL);
            pstmt.setInt(1, productID);
            pstmt.executeUpdate();
            return 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return 1;
        } finally {
            JDBCUtil.close(null, pstmt, connection);
        }
    }

    @Override
    public int productCollection(int productID) {
        connection = JDBCUtil.getConnection();

        return 0;
    }

    @Override
    public ProductDomain productSelect(String user_name) {
        return null;
    }

    @Override
    public ProductDomain productSelect(int productID) {
        return null;
    }

    @Override
    public List<ProductDomain> productSelectAll() {
        return null;
    }

}
