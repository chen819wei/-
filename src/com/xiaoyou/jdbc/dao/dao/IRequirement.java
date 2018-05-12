package com.xiaoyou.jdbc.dao.dao;

import com.xiaoyou.domain.Requirement;

import java.util.List;

public interface IRequirement {
    //需求发布
    int requirementRelease(Requirement product);

    //需求删除
    int requirementDelete(int requirementID);

    //需求收藏
    int requirementCollection(int requirementID);

    //需求查询
    Requirement requirementSelect(int requirementID);
    Requirement requirementSelect(String user_name);
    List<Requirement> requirementSelectAll();
}
