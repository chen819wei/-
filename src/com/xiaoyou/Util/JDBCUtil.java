package com.xiaoyou.Util;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.apache.commons.dbutils.QueryRunner;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

public class JDBCUtil {
    public static DataSource ds = null;

    static {
        try {
            //1.���������ļ�
            Properties p = new Properties();
            FileInputStream in = null;
            in = new FileInputStream(JDBCUtil.class.getClassLoader().getResource("db.properties").getPath());
            p.load(in);
            ds = DruidDataSourceFactory.createDataSource(p);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static  QueryRunner queryRunner(){
        return new QueryRunner(ds);
    }
    public static Connection getConnection() {
        try {
            // 2.��������
            return ds.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
