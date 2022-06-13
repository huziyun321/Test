package com.hzy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hzy.dao")
public class Boot2Application {

    public static void main(String[] args) {
        SpringApplication.run(Boot2Application.class, args);
    }

}
