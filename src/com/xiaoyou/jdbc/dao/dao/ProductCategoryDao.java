package com.xiaoyou.jdbc.dao.dao;

import com.xiaoyou.Util.JDBCUtil;
import com.xiaoyou.domain.ProductCategoryDomain;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductCategoryDao {
    // 定义数据库的链接
    private Connection connection = null;
    // 定义sql语句的执行对象
    private PreparedStatement pstmt = null;
    //结果集
    private ResultSet rs;

    public List<ProductCategoryDomain> selectAllProductCategory() {
        connection = JDBCUtil.getConnection();
        try {
            String selectAllSQL = "select * from product_category";
            pstmt = connection.prepareStatement(selectAllSQL);
            rs = pstmt.executeQuery(selectAllSQL);
            List<ProductCategoryDomain> productCategoryDomainList = new ArrayList<ProductCategoryDomain>();
            while (rs.next()) {
                ProductCategoryDomain product_category = new ProductCategoryDomain();
                product_category.setProduct_category_id(rs.getInt("product_category_id"));
                product_category.setProduct_category_name(rs.getString("product_category_name"));

                productCategoryDomainList.add(product_category);
            }
            return productCategoryDomainList;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.close(rs, pstmt, connection);
        }


        return null;
    }
}
