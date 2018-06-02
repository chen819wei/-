package com.xiaoyou.dao.home;

import com.xiaoyou.Util.JDBCUtil;
import com.xiaoyou.domain.home.HomePagePictureDomain;
import com.xiaoyou.service.IHome;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class HomeDao implements IHome {
    @Override
    public List<HomePagePictureDomain> homePagePicture() {
        try {
            String selectAllSQL = "select * from home_page_picture order by id desc limit 5";
            return JDBCUtil.queryRunner().query(selectAllSQL, new BeanListHandler<HomePagePictureDomain>(HomePagePictureDomain.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
