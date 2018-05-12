package com.xiaoyou.jdbc.dao.dao;

import com.xiaoyou.domain.RequirementDomain;
import com.xiaoyou.jdbc.dao.service.IRequirement;

import java.util.List;

public class RequirementDao implements IRequirement {
    @Override
    public int requirementRelease(RequirementDomain product) {

        return 0;
    }

    @Override
    public int requirementDelete(int requirementID) {
        return 0;
    }

    @Override
    public int requirementCollection(int requirementID) {
        return 0;
    }

    @Override
    public RequirementDomain requirementSelect(int requirementID) {
        return null;
    }

    @Override
    public RequirementDomain requirementSelect(String user_name) {
        return null;
    }

    @Override
    public List<RequirementDomain> requirementSelectAll() {
        return null;
    }


}
