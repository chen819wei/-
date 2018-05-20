package com.xiaoyou.test;

import com.google.gson.GsonBuilder;
import com.xiaoyou.jdbc.dao.dao.interest.InterestDao;
import org.junit.jupiter.api.Test;

import static sun.misc.MessageUtils.out;

public class InterestTest {
    @Test
    public void interestShowTest() {
        System.out.println("{\"list\":" + new GsonBuilder().setPrettyPrinting().create().toJson(
                new InterestDao().interestShow().toArray()) + "}");
    }

    @Test
    public void userInterestShowTest(){
        System.out.println("{\"list\":" + new GsonBuilder().setPrettyPrinting().create().toJson(
                new InterestDao().userInterestShow(1025).toArray()) + "}");
    }

    @Test
    public void addInterestTest() {
        System.out.println( new InterestDao().addInterest(1025,1030));
    }

    @Test
    public void deleteInterestTest() {
        System.out.println(new InterestDao().deleteInterest(1025, 1030));
    }
}
