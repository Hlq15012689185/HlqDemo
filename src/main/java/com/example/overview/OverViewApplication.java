package com.example.overview;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//扫描持久层接口
@MapperScan("com.example.overview.Dao")
public class OverViewApplication {
    public static void main(String[] args) {
        SpringApplication.run(OverViewApplication.class, args);
        //localhost:9090/illegelUser/getAllIllegelUser
    }
}
