package com.xiaoyou.domain.requirement;

public class RequirementCategoryDomain {
    private int requirement_category_id;
    private String requirement_category_name;

    public RequirementCategoryDomain(int requirement_category_id, String requirement_category_name) {
        this.requirement_category_id = requirement_category_id;
        this.requirement_category_name = requirement_category_name;
    }

    public RequirementCategoryDomain() {
    }

    public int getRequirement_category_id() {
        return requirement_category_id;
    }

    public void setRequirement_category_id(int requirement_category_id) {
        this.requirement_category_id = requirement_category_id;
    }

    public String getRequirement_category_name() {
        return requirement_category_name;
    }

    public void setRequirement_category_name(String requirement_category_name) {
        this.requirement_category_name = requirement_category_name;
    }

    @Override
    public String toString() {
        return "requirementCategory{" +
                "requirement_category_id=" + requirement_category_id +
                ", requirement_category_name='" + requirement_category_name + '\'' +
                '}';
    }
}
