package com.example.overview.controller;

import com.example.overview.entity.IllegelUser;
import com.example.overview.serviceImpl.IllegelUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Administrator on 2018/6/9.
 *
 * @Author:黄立群
 * @Description:违法用户控制层
 */
@Controller
@RequestMapping(value = "/illegelUser")
public class IllegelUserController {

    @Autowired
    private IllegelUserServiceImpl illegelUserService;
    @RequestMapping(value="/getAllIllegelUser")
    public void getAllIllegelUser(HttpServletRequest request){

        try {
            List<IllegelUser> list = illegelUserService.selectAllUser();
            for(IllegelUser user:list){
                System.out.println(user.getUserName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
