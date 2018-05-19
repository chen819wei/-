package com.xiaoyou.jdbc.dao.dao.user;

import com.xiaoyou.Util.JDBCUtil;
import com.xiaoyou.domain.user.EngineerDomain;
import com.xiaoyou.jdbc.dao.service.IEngineer;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class EngineerDao implements IEngineer {
    @Override
    public int engineerRequest(EngineerDomain engineer_domain) {
        try {
            String insertSQL = "INSERT INTO engineer(user_name,skill_name,certificate) values(?,?,?)";
            JDBCUtil.queryRunner().update(insertSQL, engineer_domain.getUser_name(), engineer_domain.getSkill_name(),engineer_domain.getCertificate());
            return 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return 1;
        }

    }

    @Override
    public List<EngineerDomain> engineerCertified(String user_name) {
        try {
            String selectAllSQL = "select * from engineer where user_name=?";
            return JDBCUtil.queryRunner().query(selectAllSQL, new BeanListHandler<EngineerDomain>(EngineerDomain.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
