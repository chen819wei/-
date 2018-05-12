package com.xiaoyou.domain;

public class ProductCategoryDomain {
    private int product_category_id;
    private String product_category_name;

    public ProductCategoryDomain(int product_category_id, String product_category_name) {
        this.product_category_id = product_category_id;
        this.product_category_name = product_category_name;
    }

    public ProductCategoryDomain() {
    }

    @Override
    public String toString() {
        return "ProductCategoryDomain{" +
                "product_category_id=" + product_category_id +
                ", product_category_name='" + product_category_name + '\'' +
                '}';
    }

    public int getProduct_category_id() {
        return product_category_id;
    }

    public void setProduct_category_id(int product_category_id) {
        this.product_category_id = product_category_id;
    }

    public String getProduct_category_name() {
        return product_category_name;
    }

    public void setProduct_category_name(String product_category_name) {
        this.product_category_name = product_category_name;
    }
}
