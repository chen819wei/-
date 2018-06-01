package com.xiaoyou.dao.requirement;

import com.xiaoyou.Util.JDBCUtil;
import com.xiaoyou.domain.requirement.RequirementDomain;
import com.xiaoyou.service.IRequirement;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class RequirementDao implements IRequirement {
    @Override
    public int requirementRelease(RequirementDomain requirement) {
        try {
            String insertSQL = "INSERT INTO requirement_release(price,title,description,picture,contact_name,phone_number,\n" +
                    "address,requirement_category_id,user_name) values(?,?,?,?,?,?,?,?,?)";
            JDBCUtil.queryRunner().update(insertSQL,requirement.getPrice(),requirement.getTitle(),requirement.getDescription(),
                    requirement.getPicture(),requirement.getContact_name(),requirement.getPhone_number(),requirement.getAddress(),
                    requirement.getRequirement_category_id(),requirement.getUser_name());
            return 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return 1;
        }
    }

    @Override
    public int requirementDelete(int requirementID) {
        try {
            String deleteSQL = "delete from requirement_release where requirement_release_id=?";
            JDBCUtil.queryRunner().update(deleteSQL,requirementID);
            return 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return 1;
        }
    }


    @Override
    public RequirementDomain requirementSelect(int requirementID) {
        try {
            String selectSQL = "select * from requirement_release where requirement_release_id=?";
            return JDBCUtil.queryRunner().query(selectSQL, new BeanHandler<RequirementDomain>(RequirementDomain.class),requirementID);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    @Override
    public List<RequirementDomain> userRequirementSelect(String user_name) {

        try {
            String selectAllSQL = "select * from requirement_release WHERE user_name=?";
            return JDBCUtil.queryRunner().query(selectAllSQL, new BeanListHandler<RequirementDomain>(RequirementDomain.class),user_name);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<RequirementDomain> requirementSelectAll() {
        try {
            String selectAllSQL = "select * from requirement_release order by requirement_release_id desc limit 50";
            return JDBCUtil.queryRunner().query(selectAllSQL, new BeanListHandler<RequirementDomain>(RequirementDomain.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    }



