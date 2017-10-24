package com.github.nguyentrucxinh.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = {"com.github.nguyentrucxinh.repository"})
@EntityScan(basePackages = {"com.github.nguyentrucxinh.domain"})
@ComponentScan(basePackages = {"com.github.nguyentrucxinh.domain", "com.github.nguyentrucxinh.repository", "com.github.nguyentrucxinh.seeding", "com.github.nguyentrucxinh.service", "com.github.nguyentrucxinh.web"})
public class Application {

    public static void main(final String... args) {
        SpringApplication.run(Application.class, args);
    }
}
