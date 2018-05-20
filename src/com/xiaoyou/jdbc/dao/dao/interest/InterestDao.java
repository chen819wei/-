package com.xiaoyou.jdbc.dao.dao.interest;

import com.xiaoyou.Util.JDBCUtil;
import com.xiaoyou.domain.interest.InterestLabelTableDomain;
import com.xiaoyou.domain.interest.UserInterestDomain;
import com.xiaoyou.jdbc.dao.service.IInterest;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class InterestDao implements IInterest {
    @Override
    public List<InterestLabelTableDomain> interestShow() {
        try {
            String selectAllSQL = "select * from interest_label_table";
            return JDBCUtil.queryRunner().query(selectAllSQL, new BeanListHandler<InterestLabelTableDomain>(InterestLabelTableDomain.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<UserInterestDomain> userInterestShow(int user_id) {
        try {
            String selectAllSQL = "select * from user_interest WHERE user_id=?";
            return JDBCUtil.queryRunner().query(selectAllSQL, new BeanListHandler<UserInterestDomain>(UserInterestDomain.class), user_id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public int addInterest(int user_id, int interest_label_id) {
        try {
            String addInterestSQL = "insert into user_interest(user_id,interest_label_id) values(?,?)";
            JDBCUtil.queryRunner().update(addInterestSQL,user_id,interest_label_id);
            return 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return 1;
        }

    }

    @Override
    public int deleteInterest(int user_id, int interest_label_id) {
        try {
            String addInterestSQL = "delete from user_interest where user_id=? and interest_label_id=?";
            JDBCUtil.queryRunner().update(addInterestSQL,user_id,interest_label_id);
            return 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return 1;
        }
    }
}
