package com.example.expmanagesystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.expmanagesystem.mapper")
public class ExpManageSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExpManageSystemApplication.class, args);
    }

}



