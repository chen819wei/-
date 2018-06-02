package com.xiaoyou.test;

import com.google.gson.GsonBuilder;
import com.xiaoyou.dao.home.HomeDao;
import org.junit.jupiter.api.Test;

import static sun.misc.MessageUtils.out;

public class GetHomePagePictureTest {
    @Test
    public void getHomePagePicture(){
        out("{\"list\":"+new GsonBuilder().setPrettyPrinting().create().toJson(new HomeDao().homePagePicture())+"}");

    }
}
