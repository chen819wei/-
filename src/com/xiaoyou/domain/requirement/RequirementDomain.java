package com.xiaoyou.domain.requirement;

public class RequirementDomain {
    //需求ID
    private int requirement_release_id;
    //需求发布时间
    private String requirement_release_time;
    //需求标题
    private String title;
    //需求价格
    private double price;
    //需求描述
    private String description;
    //需求图片
    private String picture;
    //需求联系人名字
    private String contact_name;
    //需求联系人电话
    private String phone_number;
    //需求联系人地址
    private String address;
    //需求分类
    private int requirement_category_id;
    //用户ID
    private String user_name;

    public RequirementDomain(String title, double price, String description, String picture, String contact_name, String phone_number, String address, int requirement_category_id, String user_name) {
        this.title = title;
        this.price = price;
        this.description = description;
        this.picture = picture;
        this.contact_name = contact_name;
        this.phone_number = phone_number;
        this.address = address;
        this.requirement_category_id = requirement_category_id;
        this.user_name = user_name;
    }

    public RequirementDomain() {
    }

    public int getRequirement_release_id() {
        return requirement_release_id;
    }

    public void setRequirement_release_id(int requirement_release_id) {
        this.requirement_release_id = requirement_release_id;
    }

    public String getRequirement_release_time() {
        return requirement_release_time;
    }

    public void setRequirement_release_time(String requirement_release_time) {
        this.requirement_release_time = requirement_release_time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
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

    public int getRequirement_category_id() {
        return requirement_category_id;
    }

    public void setRequirement_category_id(int requirement_category_id) {
        this.requirement_category_id = requirement_category_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    @Override
    public String toString() {
        return "RequirementDomain{" +
                "requirement_release_id=" + requirement_release_id +
                ", requirement_release_time='" + requirement_release_time + '\'' +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", picture='" + picture + '\'' +
                ", contact_name='" + contact_name + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", address='" + address + '\'' +
                ", requirement_category_id=" + requirement_category_id +
                ", user_name='" + user_name + '\'' +
                '}';
    }
}
