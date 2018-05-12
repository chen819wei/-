package com.xiaoyou.jdbc.dao.dao;

import com.xiaoyou.domain.Product;
import com.xiaoyou.domain.User;

import java.util.List;

public interface IProductDao {
    //商品发布
    int productRelease(Product product);
    //商品删除
    int productDelete(int productID);
    //商品收藏
    int productCollection(int productID);
    //商品查询
    Product productSelect(String user_name);
    Product productSelect(int productID);
    List<Product> productSelectAll();
}
