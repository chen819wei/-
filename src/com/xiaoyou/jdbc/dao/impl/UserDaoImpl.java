package com.xiaoyou.jdbc.dao.impl;

import com.xiaoyou.jdbc.Util.JDBCUtil;
import com.xiaoyou.jdbc.dao.dao.IUserDao;
import com.xiaoyou.jdbc.domain.User;

import java.sql.*;
import java.util.List;

public class UserDaoImpl implements IUserDao {
    // 定义数据库的链接
    private Connection connection = null;
    // 定义sql语句的执行对象
    private Statement pstmt = null;
    //结果集
    private ResultSet rs;

    @Override
    public void insert(User user) {
        try {
            connection = JDBCUtil.getConnection();
            //3、创建语句
            pstmt = connection.createStatement();
            String insertSQL = "INSERT INTO user_info(user_name,user_password,user_nickname,user_avatar,province,university,\n" +
                    "profession,student_id,sex,self_introduction) values('" + user.getUser_name() + "','" + user.getUser_password() + "','" + user.getUser_nickname() + "','" + user.getUser_avatar() + "','" + user.getProvince() + "',\n" +
                    "'" + user.getUniversity() + "','" + user.getProfession() + "','" + user.getStudent_id() + "','" + user.getSex() + "','" + user.getSelf_introduction() + "')";

            //4、执行sql语句
            pstmt.executeUpdate(insertSQL);
            // System.out.println(user);


        } catch (Exception e) {

        } finally {
            //5、释放资源
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }

    }

    @Override
    public void update(User user) {
        connection = JDBCUtil.getConnection();
        try {
            pstmt = connection.createStatement();
            String deleteSQL = "update user_info set user_password='" + user.getUser_password() + "',user_nickname='" + user.getUser_nickname() + "',user_avatar='" + user.getUser_avatar() + "',province='" + user.getProvince() + "',\n" +
                    "university='" + user.getUniversity() + "',profession='" + user.getProfession() + "',student_id='" + user.getStudent_id() + "',sex='" + user.getSex() + "',self_introduction='" + user.getSelf_introduction() + "' where user_name='" + user.getUser_name() + "'";
            pstmt.executeUpdate(deleteSQL);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //5、释放资源
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }

    }

    @Override
    public void delete(String user_name) {
        connection = JDBCUtil.getConnection();
        //3、创建语句
        try {
            pstmt = connection.createStatement();
            String deleteSQL = "delete from user_info where user_name='" + user_name + "'";
            pstmt.executeUpdate(deleteSQL);
            //System.out.println("删除成功");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //5、释放资源
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    @Override
    public User select(String user_name) {
        connection = JDBCUtil.getConnection();
        try {
            pstmt = connection.createStatement();
            String selectSQL = "select * from user_info where user_name='" + user_name + "'";
           rs= pstmt.executeQuery(selectSQL);
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
                user.setIm(rs.getString("im"));
                return user;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //5、释放资源
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    @Override
    public List<User> selectAll() {
        return null;
    }
}
