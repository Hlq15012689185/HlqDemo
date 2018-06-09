package com.example.overview.entity;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/6/9.
 *
 * @Author:黄立群
 * @Description:违法用户实体类
 */
public class IllegelUser implements Serializable {

    private String userId;

    private String userName;

    private String deptCode;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }
}
