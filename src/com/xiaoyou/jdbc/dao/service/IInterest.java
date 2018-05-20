package com.xiaoyou.jdbc.dao.service;

import com.xiaoyou.domain.interest.InterestLabelTableDomain;
import com.xiaoyou.domain.interest.UserInterestDomain;

import java.util.List;

public interface IInterest {
    //获取标签分类
    List<InterestLabelTableDomain> interestShow();

    //用户获取自己的标签
    List<UserInterestDomain> userInterestShow(int user_id);

    //用户添加标签
    int addInterest(int user_id,int interest_label_id);

    //用户删除标签
    int deleteInterest(int user_id,int interest_label_id);


}
