package com.xiaoyou.dao.product;

import com.xiaoyou.Util.JDBCUtil;
import com.xiaoyou.domain.product.ProductCategoryDomain;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import java.sql.SQLException;
import java.util.List;

public class ProductCategoryDao {
 public List<ProductCategoryDomain> selectAllProductCategory() {

        try {
            String selectAllSQL = "select * from product_category";
            return JDBCUtil.queryRunner().query(selectAllSQL, new BeanListHandler<ProductCategoryDomain>(ProductCategoryDomain.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
