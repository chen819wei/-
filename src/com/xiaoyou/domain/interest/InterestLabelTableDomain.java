package com.xiaoyou.domain.interest;

public class InterestLabelTableDomain {
    private int interest_label_id;
    private String interest_image;
    private String interest_name;

    public int getInterest_label_id() {
        return interest_label_id;
    }

    public void setInterest_label_id(int interest_label_id) {
        this.interest_label_id = interest_label_id;
    }

    public String getInterest_image() {
        return interest_image;
    }

    public void setInterest_image(String interest_image) {
        this.interest_image = interest_image;
    }

    public String getInterest_name() {
        return interest_name;
    }

    public void setInterest_name(String interest_name) {
        this.interest_name = interest_name;
    }

    @Override
    public String toString() {
        return "InterestLabelTableDomain{" +
                "interest_label_id=" + interest_label_id +
                ", interest_image='" + interest_image + '\'' +
                ", interest_name='" + interest_name + '\'' +
                '}';
    }
}
