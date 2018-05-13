package com.xiaoyou.jdbc.dao.dao;

import com.xiaoyou.Util.JDBCUtil;
import com.xiaoyou.domain.UserDomain;
import com.xiaoyou.jdbc.dao.service.IUser;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDao implements IUser {
    // 定义数据库的链接
    private Connection connection = null;
    // 定义sql语句的执行对象
    private PreparedStatement pstmt = null;
    //结果集
    private ResultSet rs;

    @Override
    public int insert(UserDomain userDomain) {
        try {
            connection = JDBCUtil.getConnection();

/*            String insertSQL = "INSERT INTO user_info(user_name,user_password,user_nickname,user_avatar,province,university,\n" +
                    "profession,student_id,sex,self_introduction) values('" + userDomain.getUser_name() + "','" + userDomain.getUser_password() + "','" + userDomain.getUser_nickname() + "','" + userDomain.getUser_avatar() + "','" + userDomain.getProvince() + "',\n" +
                    "'" + userDomain.getUniversity() + "','" + userDomain.getProfession() + "','" + userDomain.getStudent_id() + "','" + userDomain.getSex() + "','" + userDomain.getSelf_introduction() + "')";*/
            String insertSQL = "INSERT INTO user_info(user_name,user_password,user_nickname,user_avatar,province,university,\n" +
                    "profession,student_id,sex,self_introduction) values(?,?,?,?,?,?,?,?,?,?)";

            //3、创建语句
            pstmt = connection.prepareStatement(insertSQL);
            pstmt.setString(1, userDomain.getUser_name());
            pstmt.setString(2, userDomain.getUser_password());
            pstmt.setString(3, userDomain.getUser_nickname());
            pstmt.setString(4, userDomain.getUser_avatar());
            pstmt.setString(5, userDomain.getProvince());
            pstmt.setString(6, userDomain.getUniversity());
            pstmt.setString(7, userDomain.getProfession());
            pstmt.setString(8, userDomain.getStudent_id());
            pstmt.setString(9, userDomain.getSex());
            pstmt.setString(10, userDomain.getSelf_introduction());

            //4、执行sql语句
            pstmt.executeUpdate();
            return 0;


        } catch (Exception e) {
            e.printStackTrace();
            return 1;
        } finally {
            JDBCUtil.close(null, pstmt, connection);
        }

    }

    @Override
    public int update(UserDomain userDomain) {
        connection = JDBCUtil.getConnection();
        try {

            /*String deleteSQL = "update user_info set user_password='" + userDomain.getUser_password() + "',user_nickname='" + userDomain.getUser_nickname() + "',user_avatar='" + userDomain.getUser_avatar() + "',province='" + userDomain.getProvince() + "',\n" +
                    "university='" + userDomain.getUniversity() + "',profession='" + userDomain.getProfession() + "',student_id='" + userDomain.getStudent_id() + "',sex='" + userDomain.getSex() + "',self_introduction='" + userDomain.getSelf_introduction() + "' where user_name='" + userDomain.getUser_name() + "'";*/
            String deleteSQL = "update user_info set user_password=?,user_nickname=?,user_avatar=?,province=?,university=?,profession=?," +
                    "student_id=?,sex=?,self_introduction=? where user_name=?";
            pstmt = connection.prepareStatement(deleteSQL);
            pstmt.setString(10, userDomain.getUser_name());
            pstmt.setString(1, userDomain.getUser_password());
            pstmt.setString(2, userDomain.getUser_nickname());
            pstmt.setString(3, userDomain.getUser_avatar());
            pstmt.setString(4, userDomain.getProvince());
            pstmt.setString(5, userDomain.getUniversity());
            pstmt.setString(6, userDomain.getProfession());
            pstmt.setString(7, userDomain.getStudent_id());
            pstmt.setString(8, userDomain.getSex());
            pstmt.setString(9, userDomain.getSelf_introduction());
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
    public int delete(String user_name) {
        connection = JDBCUtil.getConnection();
        //3、创建语句
        try {

            String deleteSQL = "delete from user_info where user_name=?";
            pstmt = connection.prepareStatement(deleteSQL);
            pstmt.setString(1, user_name);
            pstmt.executeUpdate();
            return 0;
            //System.out.println("删除成功");
        } catch (SQLException e) {
            e.printStackTrace();
            return 1;
        } finally {
            JDBCUtil.close(null, pstmt, connection);
        }
    }

    @Override
    public UserDomain select(String user_name) {
        connection = JDBCUtil.getConnection();
        try {

            String selectSQL = "select * from user_info where user_name=?";
            pstmt = connection.prepareStatement(selectSQL);
            pstmt.setString(1, user_name);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                UserDomain userDomain = new UserDomain();
                userDomain.setUser_id(rs.getInt("user_id"));
                userDomain.setUser_name(rs.getString("user_name"));
                //userDomain.setUser_password(rs.getString("user_password"));
                userDomain.setUser_nickname(rs.getString("user_nickname"));
                userDomain.setUser_avatar(rs.getString("user_avatar"));
                userDomain.setProvince(rs.getString("province"));
                userDomain.setUniversity(rs.getString("university"));
                userDomain.setProfession(rs.getString("profession"));
                userDomain.setStudent_id(rs.getString("student_id"));
                userDomain.setSex(rs.getString("sex"));
                userDomain.setRegister_time(rs.getString("register_time"));
                userDomain.setSelf_introduction(rs.getString("self_introduction"));
                return userDomain;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(rs, pstmt, connection);
        }
        return null;
    }

    @Override
    public List<UserDomain> selectAll() {
        connection = JDBCUtil.getConnection();
        try {

            String selectAllSQL = "select * from user_info";
            pstmt = connection.prepareStatement(selectAllSQL);
            rs = pstmt.executeQuery(selectAllSQL);
            List<UserDomain> userDomainList = new ArrayList<UserDomain>();
            while (rs.next()) {
                UserDomain userDomain = new UserDomain();
                userDomain.setUser_id(rs.getInt("user_id"));
                userDomain.setUser_name(rs.getString("user_name"));
                userDomain.setUser_password(rs.getString("user_password"));
                userDomain.setUser_nickname(rs.getString("user_nickname"));
                userDomain.setUser_avatar(rs.getString("user_avatar"));
                userDomain.setProvince(rs.getString("province"));
                userDomain.setUniversity(rs.getString("university"));
                userDomain.setProfession(rs.getString("profession"));
                userDomain.setStudent_id(rs.getString("student_id"));
                userDomain.setSex(rs.getString("sex"));
                userDomain.setRegister_time(rs.getString("register_time"));
                userDomain.setSelf_introduction(rs.getString("self_introduction"));
                userDomainList.add(userDomain);
            }
            return userDomainList;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(rs, pstmt, connection);
        }
        return null;
    }
}
