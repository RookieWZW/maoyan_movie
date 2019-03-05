package com.stylefeng.guns.rest;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * Created by RookieWangZhiWei on 2019/3/1.
 */

@SpringBootApplication(scanBasePackages = {"com.stylefeng.guns"})
@EnableDubboConfiguration
public class CinemaApplication {

    public static void main(String[] args) {

        SpringApplication.run(CinemaApplication.class, args);
    }
}
