package com.xiaoyou.domain.interest;

public class UserInterestDomain {
    private int user_interest_id;
    private int interest_label_id;
    private int user_id;

    public UserInterestDomain() {
    }

    public UserInterestDomain(int user_interest_id, int interest_label_id, int user_id) {
        this.user_interest_id = user_interest_id;
        this.interest_label_id = interest_label_id;
        this.user_id = user_id;
    }

    public UserInterestDomain(int interest_label_id, int user_id) {
        this.interest_label_id = interest_label_id;
        this.user_id = user_id;
    }

    public int getUser_interest_id() {
        return user_interest_id;
    }

    public void setUser_interest_id(int user_interest_id) {
        this.user_interest_id = user_interest_id;
    }

    public int getInterest_label_id() {
        return interest_label_id;
    }

    public void setInterest_label_id(int interest_label_id) {
        this.interest_label_id = interest_label_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "UserInterestDomain{" +
                "user_interest_id=" + user_interest_id +
                ", interest_label_id=" + interest_label_id +
                ", user_id=" + user_id +
                '}';
    }
}
