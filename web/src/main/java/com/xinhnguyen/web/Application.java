package com.xinhnguyen.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = {"com.xinhnguyen.repository"})
@EntityScan(basePackages = {"com.xinhnguyen.domain"})
@ComponentScan(basePackages = {"com.xinhnguyen.domain", "com.xinhnguyen.repository", "com.xinhnguyen.seeding", "com.xinhnguyen.service", "com.xinhnguyen.web"})
public class Application {

    public static void main(final String... args) {
        SpringApplication springApplication = new SpringApplication();

        springApplication.setAdditionalProfiles("dev");
        SpringApplication.run(Application.class, args);
    }
}
