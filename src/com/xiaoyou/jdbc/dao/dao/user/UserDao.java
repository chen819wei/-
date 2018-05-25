package com.xiaoyou.jdbc.dao.dao.user;

import com.xiaoyou.Util.JDBCUtil;
import com.xiaoyou.domain.user.MyCollectDomain;
import com.xiaoyou.domain.user.UserDomain;
import com.xiaoyou.jdbc.dao.service.IUser;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.*;
import java.util.List;

public class UserDao implements IUser {
    @Override
    public int insert(UserDomain userDomain) {
        try {
            String insertSQL = "INSERT INTO user_info(user_name,user_password,user_nickname,user_avatar,province,university,\n" +
                    "profession,student_id,sex,self_introduction) values(?,?,?,?,?,?,?,?,?,?)";
            JDBCUtil.queryRunner().update(insertSQL, userDomain.getUser_name(), userDomain.getUser_password(), userDomain.getUser_nickname(),
                    userDomain.getUser_avatar(), userDomain.getProvince(), userDomain.getUniversity(),
                    userDomain.getProfession(), userDomain.getStudent_id(), userDomain.getSex(), userDomain.getSelf_introduction());
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return 1;
        }

    }

    @Override
    public int update(UserDomain userDomain) {

        try {
            String updateSQL = "update user_info set user_password=?,user_nickname=?,user_avatar=?,province=?,university=?,profession=?," +
                    "student_id=?,sex=?,self_introduction=? where user_name=?";
            JDBCUtil.queryRunner().update(updateSQL, userDomain.getUser_password(), userDomain.getUser_nickname(),
                    userDomain.getUser_avatar(), userDomain.getProvince(), userDomain.getUniversity(),
                    userDomain.getProfession(), userDomain.getStudent_id(), userDomain.getSex(), userDomain.getSelf_introduction());
            return 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return 1;
        }

    }

    @Override
    public int delete(String user_name) {
        try {
            String deleteSQL = "delete from user_info where user_name=?";
            JDBCUtil.queryRunner().update(deleteSQL, user_name);
            return 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return 1;
        }
    }

    @Override
    public UserDomain select(String user_name) {

        try {
            String selectSQL = "select * from user_info where user_name=?";
            return JDBCUtil.queryRunner().query(selectSQL, new BeanHandler<UserDomain>(UserDomain.class), user_name);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<UserDomain> selectAll() {
        try {
            String selectSQL = "select * from user_info";
            return JDBCUtil.queryRunner().query(selectSQL, new BeanListHandler<UserDomain>(UserDomain.class));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public int collection(MyCollectDomain my_collect) {
        try {
            String insertSQL = "INSERT INTO my_collect(user_name,id,mark) values(?,?,?)";
            JDBCUtil.queryRunner().update(insertSQL, my_collect.getUser_name(),my_collect.getId(),my_collect.getMark());
            return 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return 1;
        }
    }

    @Override
    public List<MyCollectDomain> userCollectionShow(String user_name) {
        try {
            String selectSQL = "select * from my_collect where user_name=?";
            return JDBCUtil.queryRunner().query(selectSQL, new BeanListHandler<MyCollectDomain>(MyCollectDomain.class), user_name);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }


}
