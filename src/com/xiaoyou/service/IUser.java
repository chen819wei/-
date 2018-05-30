package com.xiaoyou.service;

import com.xiaoyou.domain.user.MyCollectDomain;
import com.xiaoyou.domain.user.UserDomain;

import java.util.List;

public interface IUser {
    //1������û�
    int insert(UserDomain userDomain);

    //2���޸��޸��û���Ϣ
    int update(UserDomain userDomain);

    //3��ɾ���û�
    int delete(String user_name);

    //4����ѯ�û�
    UserDomain select(String user_name);

    //5����ѯ�����û�
    List<UserDomain> selectAll();

    //��Ʒ���������ղ�
    int collection(MyCollectDomain my_collect);

    //�鿴�Լ����ղ�
    List<MyCollectDomain> userCollectionShow(String user_name);
}
