package com.xiaoyou.jdbc.domain;

public class Product {
    //��ƷID
    private int product_id;
    //��Ʒ�۸�
    private String pirce;
    //��Ʒ��������
    private String description;
    //��ƷͼƬ
    private String picture;
    //��Ʒ��ϵ������
    private String contact_name;
    //��Ʒ��ϵ�˵绰
    private String phone_number;
    //��Ʒ��ϵ�˵�ַ
    private String address;
    //��Ʒ����
    private String product_category;
    //�û�ID
    private String user_id;

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getPirce() {
        return pirce;
    }

    public void setPirce(String pirce) {
        this.pirce = pirce;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getContact_name() {
        return contact_name;
    }

    public void setContact_name(String contact_name) {
        this.contact_name = contact_name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProduct_category() {
        return product_category;
    }

    public void setProduct_category(String product_category) {
        this.product_category = product_category;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public Product(String pirce, String description, String picture, String contact_name, String phone_number, String address, String product_category, String user_id) {
        this.pirce = pirce;
        this.description = description;
        this.picture = picture;
        this.contact_name = contact_name;
        this.phone_number = phone_number;
        this.address = address;
        this.product_category = product_category;
        this.user_id = user_id;
    }


}
