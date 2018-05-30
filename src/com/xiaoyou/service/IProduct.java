package com.xiaoyou.service;

import com.xiaoyou.domain.product.ProductDomain;
import com.xiaoyou.domain.user.MyCollectDomain;

import java.util.List;

public interface IProduct {
    //��Ʒ����
    int productRelease(ProductDomain product);
    //��Ʒɾ��
    int productDelete(int productID);
    //��Ʒ��ѯ
    List<ProductDomain> userProductSelect(String user_name);
    ProductDomain productSelect(int productID);
    List<ProductDomain> productSelectAll();
}
