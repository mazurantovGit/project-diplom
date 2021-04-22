package com.floor.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class ForeallApplication {

    public static void main(String[] args) {
        SpringApplication.run(ForeallApplication.class, args);
    }

}
