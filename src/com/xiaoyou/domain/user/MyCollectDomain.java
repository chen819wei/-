package com.xiaoyou.domain.user;

public class MyCollectDomain {
    private int my_collect_id;
    private String user_name;
    private int id;
    private int mark;

    public int getMy_collect_id() {
        return my_collect_id;
    }

    public void setMy_collect_id(int my_collect_id) {
        this.my_collect_id = my_collect_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public MyCollectDomain( String user_name, int id, int mark) {
        this.user_name = user_name;
        this.id = id;
        this.mark = mark;
    }

    public MyCollectDomain() {
    }

    public MyCollectDomain(int my_collect_id, String user_name, int id, int mark) {
        this.my_collect_id = my_collect_id;
        this.user_name = user_name;
        this.id = id;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "MyCollectDomain{" +
                "my_collect_id=" + my_collect_id +
                ", user_name='" + user_name + '\'' +
                ", id=" + id +
                ", mark=" + mark +
                '}';
    }
}
