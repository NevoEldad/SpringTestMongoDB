package com.spring.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EntityScan("com.spring.beans")
@EnableMongoRepositories("com.spring.repositories")
@ComponentScan("com.spring.controllers")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
