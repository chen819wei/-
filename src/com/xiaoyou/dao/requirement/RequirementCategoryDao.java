package com.xiaoyou.dao.requirement;

import com.xiaoyou.Util.JDBCUtil;
import com.xiaoyou.domain.requirement.RequirementCategoryDomain;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import java.sql.SQLException;
import java.util.List;

public class RequirementCategoryDao {

    public List<RequirementCategoryDomain> selectAllRequirementCategory() {

        try {
            String selectAllSQL = "select * from requirement_category";
            return JDBCUtil.queryRunner().query(selectAllSQL, new BeanListHandler<RequirementCategoryDomain>(RequirementCategoryDomain.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return null;
    }
}
