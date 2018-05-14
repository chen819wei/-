package com.xiaoyou.jdbc.dao.service;

import com.xiaoyou.domain.product.ProductDomain;

import java.util.List;

public interface IProduct {
    //��Ʒ����
    int productRelease(ProductDomain product);
    //��Ʒɾ��
    int productDelete(int productID);
    //��Ʒ�ղ�
    int productCollection(int productID);
    //��Ʒ��ѯ
    ProductDomain productSelect(String user_name);
    ProductDomain productSelect(int productID);
    List<ProductDomain> productSelectAll();
}
