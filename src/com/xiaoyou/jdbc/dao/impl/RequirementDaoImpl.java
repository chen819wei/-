package com.xiaoyou.jdbc.dao.impl;

import com.xiaoyou.domain.Requirement;
import com.xiaoyou.jdbc.dao.dao.IRequirement;

import java.util.List;

public class RequirementDaoImpl implements IRequirement {
    @Override
    public int requirementRelease(Requirement product) {

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
    public Requirement requirementSelect(int requirementID) {
        return null;
    }

    @Override
    public Requirement requirementSelect(String user_name) {
        return null;
    }

    @Override
    public List<Requirement> requirementSelectAll() {
        return null;
    }


}
