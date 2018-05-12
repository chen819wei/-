package com.xiaoyou.jdbc.dao.dao;

import com.xiaoyou.Util.JDBCUtil;
import com.xiaoyou.domain.RequirementCategoryDomain;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RequirementCategoryDao {
    // 定义数据库的链接
    private Connection connection = null;
    // 定义sql语句的执行对象
    private PreparedStatement pstmt = null;
    //结果集
    private ResultSet rs;

    public List<RequirementCategoryDomain> selectAllRequirementCategory() {
        connection = JDBCUtil.getConnection();
        try {
            String selectAllSQL = "select * from requirement_category";
            pstmt = connection.prepareStatement(selectAllSQL);
            rs = pstmt.executeQuery(selectAllSQL);
            List<RequirementCategoryDomain> productCategoryDomainList = new ArrayList<RequirementCategoryDomain>();
            while (rs.next()) {
                RequirementCategoryDomain requirement_category = new RequirementCategoryDomain();
                requirement_category.setRequirement_category_id(rs.getInt("requirement_category_id"));
                requirement_category.setRequirement_category_name(rs.getString("requirement_category_name"));

                productCategoryDomainList.add(requirement_category);
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
