package com.xiaoyou.domain;

public class Administrator {
    //管理员ID
    private int admin_id;
    //管理员账户名
    private String admin_name;
    //管理员密码
    private String admin_password;
    //管理员昵称
    private String admin_nickname;
    //管理员头像
    private String admin_avatar;
    //管理员自我介绍
    private String self_introduction;

    public String getAdmin_name() {
        return admin_name;
    }

    public void setAdmin_name(String admin_name) {
        this.admin_name = admin_name;
    }

    public String getAdmin_password() {
        return admin_password;
    }

    public void setAdmin_password(String admin_password) {
        this.admin_password = admin_password;
    }

    public String getAdmin_nickname() {
        return admin_nickname;
    }

    public void setAdmin_nickname(String admin_nickname) {
        this.admin_nickname = admin_nickname;
    }

    public String getAdmin_avatar() {
        return admin_avatar;
    }

    public void setAdmin_avatar(String admin_avatar) {
        this.admin_avatar = admin_avatar;
    }

    public String getSelf_introduction() {
        return self_introduction;
    }

    public void setSelf_introduction(String self_introduction) {
        this.self_introduction = self_introduction;
    }

    public Administrator(String admin_name, String admin_password, String admin_nickname, String admin_avatar, String self_introduction) {
        this.admin_name = admin_name;
        this.admin_password = admin_password;
        this.admin_nickname = admin_nickname;
        this.admin_avatar = admin_avatar;
        this.self_introduction = self_introduction;
    }

    public Administrator() {
    }


}
