package com.lanc4r.phoenix;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// 此注解表示动态扫描DAO接口所在包，实际上不加下面这条语句也可以找到
@MapperScan(basePackages = {"com.lanc4r.phoenix.attendance.dao", "com.lanc4r.phoenix.statistic.dao",
                            "com.lanc4r.phoenix.user.dao"})
public class PhoenixApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhoenixApplication.class, args);
    }

}
