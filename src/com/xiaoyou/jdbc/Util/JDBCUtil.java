package com.xiaoyou.jdbc.Util;

import java.sql.*;

public class JDBCUtil {
    //加载驱动程序
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    //数据库账号
    public static final String USERNAME = "root";
    //数据库密码
    public static final String PASSWORD = "admin";
    //数据库名
    public static final String dbName = "xy";
    // 定义访问数据库的地址
    public static final String URL = "jdbc:mysql://localhost:3306/" + dbName;

    static {
        //1、加载驱动程序
        try {
            Class.forName(JDBCUtil.DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection(){
        try {
            //2、连接数据库
            return DriverManager.getConnection(JDBCUtil.URL, JDBCUtil.USERNAME, JDBCUtil.PASSWORD);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return  null;
    }
    public static void close(ResultSet rs, Statement pstmt,Connection connection ){
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
}
