package com.xiaoyou.test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.xiaoyou.domain.product.ProductCategoryDomain;
import com.xiaoyou.domain.requirement.RequirementCategoryDomain;
import com.xiaoyou.jdbc.dao.dao.product.ProductCategoryDao;
import com.xiaoyou.jdbc.dao.dao.requirement.RequirementCategoryDao;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ProductDomainCategoryTest {
    @Test
    public void productCategoryTest(){
        ProductCategoryDao product_category_dao=new ProductCategoryDao();
        List<ProductCategoryDomain> list= product_category_dao.selectAllProductCategory();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonStr = gson.toJson(list);
        String json="{\"list\":"+jsonStr+"}";
        System.out.println(json);
    }

    @Test
    public void RequirementCategoryDao() {
        RequirementCategoryDao requirement_category_dao = new RequirementCategoryDao();
        List<RequirementCategoryDomain> list = requirement_category_dao.selectAllRequirementCategory();
        //System.out.println(list);


        System.out.println("{\"list\":"+new GsonBuilder().setPrettyPrinting().create().toJson(list)+"}");
    }
}
