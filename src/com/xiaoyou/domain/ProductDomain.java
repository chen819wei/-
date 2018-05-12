package com.xiaoyou.domain;

public class ProductDomain {
    //��Ʒ����
    private String title;
    //��ƷID
    private int product_id;
    //��Ʒ�۸�
    private Double pirce;
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
    //�û��˺�

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getProduct_id() {
        return product_id;
    }

    @Override
    public String toString() {
        return "ProductDomain{" +
                "title='" + title + '\'' +
                ", product_id=" + product_id +
                ", pirce=" + pirce +
                ", description='" + description + '\'' +
                ", picture='" + picture + '\'' +
                ", contact_name='" + contact_name + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", address='" + address + '\'' +
                ", product_category='" + product_category + '\'' +
                ", user_name='" + user_name + '\'' +
                ", release_time='" + release_time + '\'' +
                '}';
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public Double getPirce() {
        return pirce;
    }

    public void setPirce(Double pirce) {
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

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getRelease_time() {
        return release_time;
    }

    public void setRelease_time(String release_time) {
        this.release_time = release_time;
    }

    private String user_name;
    //����ʱ��
    private String release_time;

    public ProductDomain(String title, Double pirce, String description, String picture, String contact_name, String phone_number, String address, String product_category, String user_name) {
        this.title = title;
        this.pirce = pirce;
        this.description = description;
        this.picture = picture;
        this.contact_name = contact_name;
        this.phone_number = phone_number;
        this.address = address;
        this.product_category = product_category;
        this.user_name = user_name;
    }

    public ProductDomain() {

    }
}
