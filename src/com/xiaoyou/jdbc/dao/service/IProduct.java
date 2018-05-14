package com.xiaoyou.jdbc.dao.service;

import com.xiaoyou.domain.product.ProductDomain;

import java.util.List;

public interface IProduct {
    //商品发布
    int productRelease(ProductDomain product);
    //商品删除
    int productDelete(int productID);
    //商品收藏
    int productCollection(int productID);
    //商品查询
    ProductDomain productSelect(String user_name);
    ProductDomain productSelect(int productID);
    List<ProductDomain> productSelectAll();
}
