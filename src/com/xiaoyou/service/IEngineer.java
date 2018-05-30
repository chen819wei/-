package com.xiaoyou.service;

import com.xiaoyou.domain.user.EngineerDomain;
import com.xiaoyou.domain.user.SkillDomain;

import java.util.List;

public interface IEngineer {
    //工程师申请
    int engineerRequest(EngineerDomain engineer_domain);

    //工程师认证
    List<EngineerDomain> engineerCertified(String user_name);
    //技能获取
    List<SkillDomain> getSkillList();
}
