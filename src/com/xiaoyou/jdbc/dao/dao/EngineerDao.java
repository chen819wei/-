package com.xiaoyou.jdbc.dao.dao;

import com.xiaoyou.Util.JDBCUtil;
import com.xiaoyou.domain.EngineerDomain;
import com.xiaoyou.jdbc.dao.service.IEngineer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EngineerDao implements IEngineer {
    // 定义数据库的链接
    private Connection connection = null;
    // 定义sql语句的执行对象
    private PreparedStatement pstmt = null;
    //结果集
    private ResultSet rs;
    @Override
    public int engineerRequest(EngineerDomain engineer_domain) {
        try {
            connection = JDBCUtil.getConnection();
            String insertSQL = "INSERT INTO engineer(user_name,skill_name,certificate) values(?,?,?)";
            pstmt = connection.prepareStatement(insertSQL);
            pstmt.setString(1, engineer_domain.getUser_name());
            pstmt.setString(2, engineer_domain.getSkill_name());
            pstmt.setString(3, engineer_domain.getCertificate());
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
    public List<EngineerDomain> engineerCertified(String user_name) {

        connection = JDBCUtil.getConnection();
        try {

            String selectAllSQL = "select * from engineer where user_name=?";
            pstmt = connection.prepareStatement(selectAllSQL);
            pstmt.setString(1,user_name);
            rs = pstmt.executeQuery(selectAllSQL);
            List<EngineerDomain> engineer_domain_list = new ArrayList<EngineerDomain>();
            while (rs.next()) {
                EngineerDomain engineer_domain = new EngineerDomain();
                engineer_domain.setEngineer_id(rs.getInt("engineer_id"));
                engineer_domain.setSkill_name(rs.getString("skill_name"));
                engineer_domain.setCertificate(rs.getString("certificate"));
                engineer_domain.setStatus_mark(rs.getInt("status_mark"));
                engineer_domain.setRegister_time(rs.getString("register_time"));
                engineer_domain_list.add(engineer_domain);
            }
            return engineer_domain_list;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(rs, pstmt, connection);
        }
        return null;
    }

}
