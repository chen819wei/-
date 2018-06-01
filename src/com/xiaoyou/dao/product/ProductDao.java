package com.xiaoyou.dao.product;

import com.xiaoyou.Util.JDBCUtil;
import com.xiaoyou.service.IProduct;
import com.xiaoyou.domain.product.ProductDomain;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class ProductDao implements IProduct {
    @Override
    public int productRelease(ProductDomain product) {
        try {
            String insertSQL = "INSERT INTO product_release(price,title,description,picture,contact_name,phone_number,\n" +
                    "address,product_category_id,user_name) values(?,?,?,?,?,?,?,?,?)";
            JDBCUtil.queryRunner().update(insertSQL, product.getPirce(), product.getTitle(), product.getDescription(),
                    product.getPicture(), product.getContact_name(), product.getPhone_number(),
                    product.getAddress(), product.getProduct_category_id(), product.getUser_name());
            return 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return 1;
        }
    }

    @Override
    public int productDelete(int productID) {
        try {
            String deleteSQL = "delete from product_release where product_release_id=?";
            JDBCUtil.queryRunner().update(deleteSQL,productID);
            return 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return 1;
        }
    }

    @Override
    public List<ProductDomain> userProductSelect(String user_name) {
        try {
            String selectAllSQL = "select * from product_release WHERE user_name=?";
            return JDBCUtil.queryRunner().query(selectAllSQL, new BeanListHandler<ProductDomain>(ProductDomain.class),user_name);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ProductDomain productSelect(int productID) {
        try {
            String selectSQL = "select * from product_release where product_release_id=?";
            return JDBCUtil.queryRunner().query(selectSQL, new BeanHandler<ProductDomain>(ProductDomain.class),productID);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<ProductDomain> productSelectAll() {
        try {
            String selectAllSQL = "select * from product_release order by product_release_id desc limit 50";
            return JDBCUtil.queryRunner().query(selectAllSQL, new BeanListHandler<ProductDomain>(ProductDomain.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}


