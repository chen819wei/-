package com.xiaoyou.service;

import com.xiaoyou.domain.requirement.RequirementDomain;

import java.util.List;

public interface IRequirement {
    //需求发布
    int requirementRelease(RequirementDomain requirement);

    //需求删除
    int requirementDelete(int requirementID);

    //需求查询
    RequirementDomain requirementSelect(int requirementID);
    List<RequirementDomain> userRequirementSelect(String user_name);
    List<RequirementDomain> requirementSelectAll();
}
