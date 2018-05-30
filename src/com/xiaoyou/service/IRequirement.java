package com.xiaoyou.service;

import com.xiaoyou.domain.requirement.RequirementDomain;

import java.util.List;

public interface IRequirement {
    //���󷢲�
    int requirementRelease(RequirementDomain requirement);

    //����ɾ��
    int requirementDelete(int requirementID);

    //�����ѯ
    RequirementDomain requirementSelect(int requirementID);
    List<RequirementDomain> userRequirementSelect(String user_name);
    List<RequirementDomain> requirementSelectAll();
}
