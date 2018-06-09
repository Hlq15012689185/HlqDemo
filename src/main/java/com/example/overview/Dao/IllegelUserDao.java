package com.example.overview.Dao;

import com.example.overview.entity.IllegelUser;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/6/9.
 *
 * @Author:黄立群
 * @Description:违法用户实体类
 */

public interface IllegelUserDao {
    public List<IllegelUser> selectAllUser()throws Exception;
}
