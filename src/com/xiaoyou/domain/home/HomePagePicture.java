package com.xiaoyou.domain.home;

public class HomePagePicture {
    private int id;
    private String picture_name;
    private String picture_address;

    public HomePagePicture(int id, String picture_name, String picture_address) {
        this.id = id;
        this.picture_name = picture_name;
        this.picture_address = picture_address;
    }

    public HomePagePicture() {
    }

    @Override
    public String toString() {
        return "HomePagePicture{" +
                "id=" + id +
                ", picture_name='" + picture_name + '\'' +
                ", picture_address='" + picture_address + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPicture_name() {
        return picture_name;
    }

    public void setPicture_name(String picture_name) {
        this.picture_name = picture_name;
    }

    public String getPicture_address() {
        return picture_address;
    }

    public void setPicture_address(String picture_address) {
        this.picture_address = picture_address;
    }
}
