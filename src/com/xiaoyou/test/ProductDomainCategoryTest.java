package com.xiaoyou.test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.xiaoyou.domain.product.ProductCategoryDomain;
import com.xiaoyou.domain.product.ProductDomain;
import com.xiaoyou.domain.requirement.RequirementCategoryDomain;
import com.xiaoyou.jdbc.dao.dao.product.ProductCategoryDao;
import com.xiaoyou.jdbc.dao.dao.product.ProductDao;
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
    public void requirementCategoryDao() {
        RequirementCategoryDao requirement_category_dao = new RequirementCategoryDao();
        List<RequirementCategoryDomain> list = requirement_category_dao.selectAllRequirementCategory();
        //System.out.println(list);
        System.out.println("{\"list\":"+new GsonBuilder().setPrettyPrinting().create().toJson(list)+"}");
    }

    @Test
    public void productSelectAll() {
        ProductDao product_dao = new ProductDao();
        List<ProductDomain> list = product_dao.productSelectAll();
        System.out.println("{\"list\":" + new GsonBuilder().setPrettyPrinting().create().toJson(list) + "}");
    }

    @Test
    public void producDetails() {
        ProductDao product_dao = new ProductDao();
        ProductDomain product_domain = product_dao.productSelect(15);
        System.out.println(new GsonBuilder().setPrettyPrinting().create().toJson(product_domain));
    }

    @Test
    public void producDelete() {
        ProductDao product_dao = new ProductDao();
        int i=product_dao.productDelete(12);
        if (i == 0) {
            System.out.println("É¾³ý³É¹¦");
        } else {
            System.out.println("É¾³ýÊ§°Ü");
        }

    }
    @Test
    public void userProductSelect() {
        ProductDao product_dao = new ProductDao();
        List<ProductDomain> list = product_dao.userProductSelect("user_name");
        System.out.println("{\"list\":" + new GsonBuilder().setPrettyPrinting().create().toJson(list) + "}");
    }
}
