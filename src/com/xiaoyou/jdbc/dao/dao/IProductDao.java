package com.xiaoyou.jdbc.dao.dao;

import com.xiaoyou.jdbc.domain.Product;

public interface IProductDao {
    //商品发布
    int productRelease(Product product);
    //商品删除
    int productDelete(int productID);
    //商品收藏
    int productCollection(int productID);
}
