package com.xiaoyou.domain;

/*
* dao	���ݷ��ʲ㣨�ӿڣ�	�����ݴ򽻵������������ݿ������Ҳ�������ļ���д������������redis���������
* ��֮�����ݲ����йصĶ���������

domain	ʵ����	һ�������ݿ�ı����Ӧ����װdao��ȡ����������Ϊһ������һ
��ֻ��dao����service��֮�䴫�䡣

dto	���ݴ����	��ʵ��������service����web��֮�䴫�䣬��ʵ�ʿ����з��֣�
�ܶ�ʱ��һ��entity�������������ǵ�ҵ�����󣬿��ܳ��ָ��û�����Ϣʮ��֮�࣬
��ʱ�������dto Ҳ����entity�Ĳ���

service	ҵ���߼����ӿڣ�
дҵ���߼���Ҳ���˽�bll�������ҵ��ӿ�ʱ��Ӧ��վ�ڡ�ʹ���ߡ��ĽǶȣ����紦���ѯ�û���Ϣ

serviceImpl	ҵ���߼���ʵ�֣�
ʵ������ҵ��ӿ�

web	������ ͨ��Ҳ����д�� controller
* */

public class UserDomain {
    //�û�ID
    private int user_id;
    //�û��˻���
    private String user_name;
    //�û�����
    private String user_password;
    //�û��ǳ�
    private String user_nickname;
    //�û�ͷ��
    private String user_avatar;
    //�û�ʡ��
    private String province;
    //�û�ѧУ
    private String university;
    //�û�רҵ
    private String profession;
    //�û�ѧ��
    private String student_id;
    //�û��Ա�
    private String sex;
    //�û����ҽ���
    private String self_introduction;
    //ע��ʱ��
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
