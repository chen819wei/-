package com.xiaoyou.Util;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

public class JDBCUtil {
    public static DataSource ds = null;
    static {
        try {
            //1.加载配置文件
            Properties p = new Properties();
            FileInputStream in = null;
            in = new FileInputStream(JDBCUtil.class.getClassLoader().getResource("db.properties").getPath());
            p.load(in);
            ds = DruidDataSourceFactory.createDataSource(p);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        try {
            // 2.连接数据
            return ds.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void close(ResultSet rs, Statement pstmt, Connection connection) {
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
