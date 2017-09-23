package com.xinhnguyen.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.xinhnguyen.persistence"})
@EntityScan(basePackages = {"com.xinhnguyen.domain"})
@ComponentScan(basePackages = {"com.xinhnguyen.persistence", "com.xinhnguyen.domain", "com.xinhnguyen.web", "com.xinhnguyen.service"})
public class Application {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication();

        springApplication.setAdditionalProfiles("dev");
        SpringApplication.run(Application.class, args);
    }
}
