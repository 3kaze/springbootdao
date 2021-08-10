package com.wzw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wei
 * @Date 2021/8/9
 */
@MapperScan("com.wzw.mybatis.repository")
@SpringBootApplication
public class MyBatisApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyBatisApplication.class, args);
    }
}
