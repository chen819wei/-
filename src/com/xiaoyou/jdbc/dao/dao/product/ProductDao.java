package com.xiaoyou.jdbc.dao.dao.product;

import com.xiaoyou.Util.JDBCUtil;
import com.xiaoyou.domain.user.MyCollectDomain;
import com.xiaoyou.jdbc.dao.service.IProduct;
import com.xiaoyou.domain.product.ProductDomain;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
            pstmt.setInt(8, product.getProduct_category_id());
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
            String deleteSQL = "delete from product_release where product_release_id=?";
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
    public int productCollection(MyCollectDomain my_collect) {
        try {
            connection = JDBCUtil.getConnection();
            String insertSQL = "INSERT INTO my_collect(user_name,id,mark) values(?,?,?)";
            pstmt = connection.prepareStatement(insertSQL);
            pstmt.setString(1, my_collect.getUser_name());
            pstmt.setInt(2,my_collect.getId());
            pstmt.setInt(3,my_collect.getMark());
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
    public List<ProductDomain> userProductSelect(String user_name) {
        connection = JDBCUtil.getConnection();
        try {
            String selectAllSQL = "select * from product_release WHERE user_name=?";
            pstmt = connection.prepareStatement(selectAllSQL);
            pstmt.setString(1,user_name);
            rs = pstmt.executeQuery();
            List<ProductDomain> productDomainList = new ArrayList<>();
            while (rs.next()) {
                ProductDomain product_domain = new ProductDomain();
                product_domain.setPirce(rs.getDouble("price"));
                product_domain.setProduct_release_id(rs.getInt("product_release_id"));
                product_domain.setProduct_category_id(rs.getInt("product_category_id"));
                product_domain.setPicture(rs.getString("picture"));
                product_domain.setDescription(rs.getString("description"));
                productDomainList.add(product_domain);
            }
            return productDomainList;

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(rs, pstmt, connection);
        }


        return null;
    }

    @Override
    public ProductDomain productSelect(int productID) {
        connection = JDBCUtil.getConnection();
        try {

            String selectSQL = "select * from product_release where product_release_id=?";
            pstmt = connection.prepareStatement(selectSQL);
            pstmt.setInt(1, productID);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                ProductDomain product_domain = new ProductDomain();
                product_domain.setProduct_release_id(rs.getInt("product_release_id"));
                product_domain.setUser_name(rs.getString("user_name"));
                product_domain.setPirce(rs.getDouble("price"));
                product_domain.setTitle(rs.getString("title"));
                product_domain.setRelease_time(rs.getString("release_time"));
                product_domain.setDescription(rs.getString("description"));
                product_domain.setPicture(rs.getString("picture"));
                product_domain.setContact_name(rs.getString("contact_name"));
                product_domain.setPhone_number(rs.getString("phone_number"));
                product_domain.setAddress(rs.getString("address"));
                product_domain.setProduct_category_id(rs.getInt("product_category_id"));

                return product_domain;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(rs, pstmt, connection);
        }
        return null;
    }

    @Override
    public List<ProductDomain> productSelectAll() {
        connection = JDBCUtil.getConnection();
        try {
            String selectAllSQL = "select * from product_release";
            pstmt = connection.prepareStatement(selectAllSQL);
            rs = pstmt.executeQuery(selectAllSQL);
            List<ProductDomain> productDomainList = new ArrayList<>();
            while (rs.next()) {
                ProductDomain product_domain = new ProductDomain();
                product_domain.setProduct_release_id(rs.getInt("product_release_id"));
                product_domain.setPirce(rs.getDouble("price"));
                product_domain.setPicture(rs.getString("picture"));
                product_domain.setDescription(rs.getString("description"));
                product_domain.setProduct_category_id(rs.getInt("product_category_id"));
                productDomainList.add(product_domain);
            }
            System.out.println(productDomainList.toString());
            return productDomainList;

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(rs, pstmt, connection);
        }


        return null;
    }
}


