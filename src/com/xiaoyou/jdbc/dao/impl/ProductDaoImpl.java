package com.xiaoyou.jdbc.dao.impl;

import com.xiaoyou.jdbc.Util.JDBCUtil;
import com.xiaoyou.jdbc.dao.dao.IProductDao;
import com.xiaoyou.jdbc.domain.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductDaoImpl implements IProductDao {
    // 定义数据库的链接
    private Connection connection = null;
    // 定义sql语句的执行对象
    private PreparedStatement pstmt = null;
    //结果集
    private ResultSet rs;

    @Override
    public int productRelease(Product product) {
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

        return 0;
    }
}
