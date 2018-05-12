package com.xiaoyou.domain;

public class RequirementDomain {
    //需求ID
    private int requirement_id;
    //需求价格
    private int price;
    //需求描述
    private String description;
    //需求图片描述
    private String picture;
    //需求联系人名字
    private String contact_name;
    //需求联系人电话
    private String phone_number;
    //需求联系人地址
    private String address;
    //需求分类
    private String requirement_category;
    //用户ID
    private String user_id;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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

    public String getRequirement_category() {
        return requirement_category;
    }

    public void setRequirement_category(String requirement_category) {
        this.requirement_category = requirement_category;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public RequirementDomain(int price, String description, String picture, String contact_name, String phone_number, String address, String requirement_category, String user_id) {
        this.price = price;
        this.description = description;
        this.picture = picture;
        this.contact_name = contact_name;
        this.phone_number = phone_number;
        this.address = address;
        this.requirement_category = requirement_category;
        this.user_id = user_id;
    }

}
