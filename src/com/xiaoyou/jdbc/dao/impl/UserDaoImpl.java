package com.xiaoyou.jdbc.dao.impl;

import com.xiaoyou.jdbc.Util.JDBCUtil;
import com.xiaoyou.jdbc.dao.dao.IUserDao;
import com.xiaoyou.jdbc.domain.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements IUserDao {
    // 定义数据库的链接
    private Connection connection = null;
    // 定义sql语句的执行对象
    private PreparedStatement pstmt = null;
    //结果集
    private ResultSet rs;

    @Override
    public void insert(User user) {
        try {
            connection = JDBCUtil.getConnection();

/*            String insertSQL = "INSERT INTO user_info(user_name,user_password,user_nickname,user_avatar,province,university,\n" +
                    "profession,student_id,sex,self_introduction) values('" + user.getUser_name() + "','" + user.getUser_password() + "','" + user.getUser_nickname() + "','" + user.getUser_avatar() + "','" + user.getProvince() + "',\n" +
                    "'" + user.getUniversity() + "','" + user.getProfession() + "','" + user.getStudent_id() + "','" + user.getSex() + "','" + user.getSelf_introduction() + "')";*/
            String insertSQL = "INSERT INTO user_info(user_name,user_password,user_nickname,user_avatar,province,university,\n" +
                    "profession,student_id,sex,self_introduction) values(?,?,?,?,?,?,?,?,?,?)";

            //3、创建语句
            pstmt = connection.prepareStatement(insertSQL);
            pstmt.setString(1, user.getUser_name());
            pstmt.setString(2, user.getUser_password());
            pstmt.setString(3, user.getUser_nickname());
            pstmt.setString(4, user.getUser_avatar());
            pstmt.setString(5, user.getProvince());
            pstmt.setString(6, user.getUniversity());
            pstmt.setString(7, user.getProfession());
            pstmt.setString(8, user.getStudent_id());
            pstmt.setString(9, user.getSex());
            pstmt.setString(10, user.getSelf_introduction());

            //4、执行sql语句
            pstmt.executeUpdate();
            // System.out.println(user);


        } catch (Exception e) {

        } finally {
            JDBCUtil.close(null, pstmt, connection);
        }

    }

    @Override
    public void update(User user) {
        connection = JDBCUtil.getConnection();
        try {

            /*String deleteSQL = "update user_info set user_password='" + user.getUser_password() + "',user_nickname='" + user.getUser_nickname() + "',user_avatar='" + user.getUser_avatar() + "',province='" + user.getProvince() + "',\n" +
                    "university='" + user.getUniversity() + "',profession='" + user.getProfession() + "',student_id='" + user.getStudent_id() + "',sex='" + user.getSex() + "',self_introduction='" + user.getSelf_introduction() + "' where user_name='" + user.getUser_name() + "'";*/
            String deleteSQL = "update user_info set user_password=?,user_nickname=?,user_avatar=?,province=?,university=?,profession=?," +
                    "student_id=?,sex=?,self_introduction=? where user_name=?";
            pstmt = connection.prepareStatement(deleteSQL);
            pstmt.setString(10, user.getUser_name());
            pstmt.setString(1, user.getUser_password());
            pstmt.setString(2, user.getUser_nickname());
            pstmt.setString(3, user.getUser_avatar());
            pstmt.setString(4, user.getProvince());
            pstmt.setString(5, user.getUniversity());
            pstmt.setString(6, user.getProfession());
            pstmt.setString(7, user.getStudent_id());
            pstmt.setString(8, user.getSex());
            pstmt.setString(9, user.getSelf_introduction());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(null, pstmt, connection);
        }

    }

    @Override
    public void delete(String user_name) {
        connection = JDBCUtil.getConnection();
        //3、创建语句
        try {

            String deleteSQL = "delete from user_info where user_name=?";
            pstmt = connection.prepareStatement(deleteSQL);
            pstmt.setString(1, user_name);
            pstmt.executeUpdate();

            //System.out.println("删除成功");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(null, pstmt, connection);
        }
    }

    @Override
    public User select(String user_name) {
        connection = JDBCUtil.getConnection();
        try {

            String selectSQL = "select * from user_info where user_name=?";
            pstmt = connection.prepareStatement(selectSQL);
            pstmt.setString(1,user_name);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                User user = new User();
                user.setUser_id(rs.getInt("user_id"));
                user.setUser_name(rs.getString("user_name"));
                user.setUser_password(rs.getString("user_password"));
                user.setUser_nickname(rs.getString("user_nickname"));
                user.setUser_avatar(rs.getString("user_avatar"));
                user.setProvince(rs.getString("province"));
                user.setUniversity(rs.getString("university"));
                user.setProfession(rs.getString("profession"));
                user.setStudent_id(rs.getString("student_id"));
                user.setSex(rs.getString("sex"));
                user.setRegister_time(rs.getString("register_time"));
                user.setSelf_introduction(rs.getString("self_introduction"));
                return user;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(rs, pstmt, connection);
        }
        return null;
    }

    @Override
    public List<User> selectAll() {
        connection = JDBCUtil.getConnection();
        try {

            String selectAllSQL = "select * from user_info";
            pstmt = connection.prepareStatement(selectAllSQL);
            rs = pstmt.executeQuery(selectAllSQL);
            List<User> userList = new ArrayList<User>();
            while (rs.next()) {
                User user = new User();
                user.setUser_id(rs.getInt("user_id"));
                user.setUser_name(rs.getString("user_name"));
                user.setUser_password(rs.getString("user_password"));
                user.setUser_nickname(rs.getString("user_nickname"));
                user.setUser_avatar(rs.getString("user_avatar"));
                user.setProvince(rs.getString("province"));
                user.setUniversity(rs.getString("university"));
                user.setProfession(rs.getString("profession"));
                user.setStudent_id(rs.getString("student_id"));
                user.setSex(rs.getString("sex"));
                user.setRegister_time(rs.getString("register_time"));
                user.setSelf_introduction(rs.getString("self_introduction"));
                userList.add(user);
            }
            return userList;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(rs, pstmt, connection);
        }
        return null;
    }
}
