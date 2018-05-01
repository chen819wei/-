package com.xiaoyou.jdbc.Util;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCUtil {
    //������������
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    //���ݿ��˺�
    public static final String USERNAME = "root";
    //���ݿ�����
    public static final String PASSWORD = "admin";
    //���ݿ���
    public static final String dbName = "xy";
    // ����������ݿ�ĵ�ַ
    public static final String URL = "jdbc:mysql://localhost:3306/" + dbName;

    static {
        //1��������������
        try {
            Class.forName(JDBCUtil.DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection(){
        try {
            //2���������ݿ�
            return DriverManager.getConnection(JDBCUtil.URL, JDBCUtil.USERNAME, JDBCUtil.PASSWORD);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return  null;
    }
}
