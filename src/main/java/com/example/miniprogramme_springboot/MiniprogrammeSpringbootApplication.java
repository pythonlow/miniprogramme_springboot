package com.example.miniprogramme_springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.miniprogramme_springboot.dao")
@SpringBootApplication
public class MiniprogrammeSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiniprogrammeSpringbootApplication.class, args);
    }

}
