package com.xiaoyou.jdbc.dao.dao;

import com.xiaoyou.jdbc.domain.Product;

public interface IProductDao {
    //��Ʒ����
    int productRelease(Product product);
    //��Ʒɾ��
    int productDelete(int productID);
    //��Ʒ�ղ�
    int productCollection(int productID);
}
