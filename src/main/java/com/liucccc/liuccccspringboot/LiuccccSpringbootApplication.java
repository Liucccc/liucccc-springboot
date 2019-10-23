package com.liucccc.liuccccspringboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.liucccc.liuccccspringboot.dao")
public class LiuccccSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(LiuccccSpringbootApplication.class, args);
    }

}
