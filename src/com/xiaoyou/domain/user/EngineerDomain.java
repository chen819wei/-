package com.xiaoyou.domain.user;

public class EngineerDomain {
    private int engineer_id;
    private String user_name;
    private int skill_id;
    private String certificate;
    private int status_mark;
    private String register_time;

    public int getEngineer_id() {
        return engineer_id;
    }

    public void setEngineer_id(int engineer_id) {
        this.engineer_id = engineer_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public int getskill_id() {
        return skill_id;
    }

    public void setSkill_id(int skill_id) {
        this.skill_id = skill_id;
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public int getStatus_mark() {
        return status_mark;
    }

    public void setStatus_mark(int status_mark) {
        this.status_mark = status_mark;
    }

    public String getRegister_time() {
        return register_time;
    }

    public void setRegister_time(String register_time) {
        this.register_time = register_time;
    }

    @Override
    public String toString() {
        return "EngineerDomain{" +
                "engineer_id=" + engineer_id +
                ", user_id=" + user_name +
                ", skill_id='" + skill_id + '\'' +
                ", certificate='" + certificate + '\'' +
                ", status_mark=" + status_mark +
                ", register_time='" + register_time + '\'' +
                '}';
    }

    public EngineerDomain( String user_name, int skill_id, String certificate) {
        this.user_name = user_name;
        this.skill_id = skill_id;
        this.certificate = certificate;
    }

    public EngineerDomain() {
    }
}
