package com.xiaoyou.jdbc.dao.dao;

import com.xiaoyou.jdbc.domain.User;

import java.util.List;

public interface IUserDao {
    //1������û�
    void insert(User user);

    //2���޸��޸��û���Ϣ
    void update(User user);

    //3��ɾ���û�
    void delete(String user_name);

    //4����ѯ�û�
    User select(String user_name);

    //5����ѯ�����û�
    List<User> selectAll();
}
