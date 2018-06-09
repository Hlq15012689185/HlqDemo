package com.example.overview.serviceImpl;

import com.example.overview.Dao.IllegelUserDao;

import com.example.overview.entity.IllegelUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/6/9.
 *
 * @Author:黄立群
 * @Description:违法用户业务层
 */
@Service
public class IllegelUserServiceImpl {

    @Resource
    private IllegelUserDao dao;

    public List<IllegelUser> selectAllUser() {
        return dao.selectAllUser();
    }
}
