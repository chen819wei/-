package com.xiaoyou.jdbc.dao.service;

import com.xiaoyou.domain.RequirementDomain;

import java.util.List;

public interface IRequirement {
    //需求发布
    int requirementRelease(RequirementDomain product);

    //需求删除
    int requirementDelete(int requirementID);

    //需求收藏
    int requirementCollection(int requirementID);

    //需求查询
    RequirementDomain requirementSelect(int requirementID);
    RequirementDomain requirementSelect(String user_name);
    List<RequirementDomain> requirementSelectAll();
}
