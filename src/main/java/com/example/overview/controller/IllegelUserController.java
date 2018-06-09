package com.example.overview.controller;

import com.example.overview.entity.IllegelUser;
import com.example.overview.serviceImpl.IllegelUserServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/6/9.
 *
 * @Author:黄立群
 * @Description:违法用户控制层
 */
@RestController
@RequestMapping("/illegelUser")
public class IllegelUserController {

    @Resource
    private IllegelUserServiceImpl illegelUserService;

    @GetMapping("/getAllIllegelUser")
    public void getAllIllegelUser() {
        List<IllegelUser> illegelUsers = illegelUserService.selectAllUser();
        illegelUsers.forEach(System.out::println);
    }
}
