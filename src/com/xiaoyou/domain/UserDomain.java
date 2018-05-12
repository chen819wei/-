package com.xiaoyou.domain;

/*
* dao	数据访问层（接口）	与数据打交道，可以是数据库操作，也可以是文件读写操作，甚至是redis缓存操作，
* 总之与数据操作有关的都放在这里

domain	实体类	一般与数据库的表相对应，封装dao层取出来的数据为一个对象，一
般只在dao层与service层之间传输。

dto	数据传输层	其实就是用于service层与web层之间传输，在实际开发中发现，
很多时间一个entity并不能满足我们的业务需求，可能呈现给用户的信息十分之多，
这时候就有了dto 也就是entity的补充

service	业务逻辑（接口）
写业务逻辑，也有人叫bll，在设计业务接口时候应该站在“使用者”的角度，比如处理查询用户信息

serviceImpl	业务逻辑（实现）
实现我们业务接口

web	控制器 通常也可以写成 controller
* */

public class UserDomain {
    //用户ID
    private int user_id;
    //用户账户名
    private String user_name;
    //用户密码
    private String user_password;
    //用户昵称
    private String user_nickname;
    //用户头像
    private String user_avatar;
    //用户省份
    private String province;
    //用户学校
    private String university;
    //用户专业
    private String profession;
    //用户学号
    private String student_id;
    //用户性别
    private String sex;
    //用户自我介绍
    private String self_introduction;
    //注册时间
    private String register_time;

    public String getRegister_time() {
        return register_time;
    }

    public void setRegister_time(String register_time) {
        this.register_time = register_time;
    }


    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }


    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_nickname() {
        return user_nickname;
    }

    public void setUser_nickname(String user_nickname) {
        this.user_nickname = user_nickname;
    }

    public String getUser_avatar() {
        return user_avatar;
    }

    public void setUser_avatar(String user_avatar) {
        this.user_avatar = user_avatar;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSelf_introduction() {
        return self_introduction;
    }

    public void setSelf_introduction(String self_introduction) {
        this.self_introduction = self_introduction;
    }


    public UserDomain(String user_name, String user_password, String user_nickname, String user_avatar, String province, String university, String profession, String student_id, String sex, String self_introduction) {
        this.user_name = user_name;
        this.user_password = user_password;
        this.user_nickname = user_nickname;
        this.user_avatar = user_avatar;
        this.province = province;
        this.university = university;
        this.profession = profession;
        this.student_id = student_id;
        this.sex = sex;
        this.self_introduction = self_introduction;
    }

    public UserDomain() {

    }

    @Override
    public String toString() {
        return "UserDomain{" +
                "user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", user_password='" + user_password + '\'' +
                ", user_nickname='" + user_nickname + '\'' +
                ", user_avatar='" + user_avatar + '\'' +
                ", province='" + province + '\'' +
                ", university='" + university + '\'' +
                ", profession='" + profession + '\'' +
                ", student_id='" + student_id + '\'' +
                ", sex='" + sex + '\'' +
                ", self_introduction='" + self_introduction + '\'' +
                ", register_time='" + register_time + '\'' +
                '}';
    }
}
