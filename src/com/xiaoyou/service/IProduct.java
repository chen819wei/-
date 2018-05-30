package com.xiaoyou.service;

import com.xiaoyou.domain.product.ProductDomain;
import com.xiaoyou.domain.user.MyCollectDomain;

import java.util.List;

public interface IProduct {
    //商品发布
    int productRelease(ProductDomain product);
    //商品删除
    int productDelete(int productID);
    //商品查询
    List<ProductDomain> userProductSelect(String user_name);
    ProductDomain productSelect(int productID);
    List<ProductDomain> productSelectAll();
}
