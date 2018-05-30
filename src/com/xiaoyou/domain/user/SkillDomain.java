package com.xiaoyou.domain.user;

public class SkillDomain {
    private int skill_id;
    private String skill_name;

    public SkillDomain(int skill_id, String skill_name) {
        this.skill_id = skill_id;
        this.skill_name = skill_name;
    }

    public SkillDomain() {
    }

    public int getSkill_id() {
        return skill_id;
    }

    public void setSkill_id(int skill_id) {
        this.skill_id = skill_id;
    }

    public String getSkill_name() {
        return skill_name;
    }

    public void setSkill_name(String skill_name) {
        this.skill_name = skill_name;
    }

    @Override
    public String toString() {
        return "SkillDomain{" +
                "skill_id=" + skill_id +
                ", skill_name='" + skill_name + '\'' +
                '}';
    }
}
