package com.xiaoyou.jdbc.dao.service;

import com.xiaoyou.domain.interest.InterestLabelTableDomain;
import com.xiaoyou.domain.interest.UserInterestDomain;

import java.util.List;

public interface IInterest {
    //��ȡ��ǩ����
    List<InterestLabelTableDomain> interestShow();

    //�û���ȡ�Լ��ı�ǩ
    List<UserInterestDomain> userInterestShow(int user_id);

    //�û���ӱ�ǩ
    int addInterest(int user_id,int interest_label_id);

    //�û�ɾ����ǩ
    int deleteInterest(int user_id,int interest_label_id);


}
