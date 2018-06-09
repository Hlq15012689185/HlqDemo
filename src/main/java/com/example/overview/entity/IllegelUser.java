package com.example.overview.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/6/9.
 *
 * @Author:黄立群
 * @Description:违法用户实体类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class IllegelUser implements Serializable {

    private static final long serialVersionUID = 2695592208622623729L;
    private String userId;
    private String userName;
    private String deptCode;
}
