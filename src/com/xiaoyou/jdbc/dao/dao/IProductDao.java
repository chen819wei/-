package com.xiaoyou.jdbc.dao.dao;

import com.xiaoyou.domain.Product;
import com.xiaoyou.domain.User;

import java.util.List;

public interface IProductDao {
    //��Ʒ����
    int productRelease(Product product);
    //��Ʒɾ��
    int productDelete(int productID);
    //��Ʒ�ղ�
    int productCollection(int productID);
    //��Ʒ��ѯ
    Product productSelect(String user_name);
    Product productSelect(int productID);
    List<Product> productSelectAll();
}
