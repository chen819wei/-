package com.xiaoyou.jdbc.dao.dao;

import com.xiaoyou.domain.Requirement;

import java.util.List;

public interface IRequirement {
    //���󷢲�
    int requirementRelease(Requirement product);

    //����ɾ��
    int requirementDelete(int requirementID);

    //�����ղ�
    int requirementCollection(int requirementID);

    //�����ѯ
    Requirement requirementSelect(int requirementID);
    Requirement requirementSelect(String user_name);
    List<Requirement> requirementSelectAll();
}
