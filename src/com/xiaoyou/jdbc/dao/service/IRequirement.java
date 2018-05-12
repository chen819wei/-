package com.xiaoyou.jdbc.dao.service;

import com.xiaoyou.domain.RequirementDomain;

import java.util.List;

public interface IRequirement {
    //���󷢲�
    int requirementRelease(RequirementDomain product);

    //����ɾ��
    int requirementDelete(int requirementID);

    //�����ղ�
    int requirementCollection(int requirementID);

    //�����ѯ
    RequirementDomain requirementSelect(int requirementID);
    RequirementDomain requirementSelect(String user_name);
    List<RequirementDomain> requirementSelectAll();
}
