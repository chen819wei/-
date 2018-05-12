package com.xiaoyou.test;

import com.google.gson.Gson;
import com.xiaoyou.domain.ProductCategoryDomain;
import com.xiaoyou.domain.RequirementCategoryDomain;
import com.xiaoyou.jdbc.dao.dao.ProductCategoryDao;
import com.xiaoyou.jdbc.dao.dao.RequirementCategoryDao;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ProductDomainCategoryTest {
    @Test
    public void productCategoryTest(){
        ProductCategoryDao product_category_dao=new ProductCategoryDao();
        List<ProductCategoryDomain> list= product_category_dao.selectAllProductCategory();
           //System.out.println(list);
        System.out.println(new Gson().toJson(list));
    }

    @Test
    public void RequirementCategoryDao() {
        RequirementCategoryDao requirement_category_dao = new RequirementCategoryDao();
        List<RequirementCategoryDomain> list = requirement_category_dao.selectAllRequirementCategory();
        //System.out.println(list);
        System.out.println(new Gson().toJson(list));
    }
}
