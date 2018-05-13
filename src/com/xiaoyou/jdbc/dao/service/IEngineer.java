package com.xiaoyou.jdbc.dao.service;

import com.xiaoyou.domain.EngineerDomain;

import java.util.List;

public interface IEngineer {
    //工程师申请
    int engineerRequest(EngineerDomain engineer_domain);
    //工程师认证
    List<EngineerDomain> engineerCertified( String user_name);
}
