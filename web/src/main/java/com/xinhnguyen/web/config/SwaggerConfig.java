package com.xinhnguyen.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.function.Predicate;

/**
 * Provides configuration beans for the Swagger API documentation generator.
 *
 * @author Xinh Nguyen
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    /**
     * The project version.
     */
    public static final String PROJECT_VERSION = "0.0.1";
    /**
     * The project contact name.
     */
    public static final String PROJECT_CONTACT_NAME = "Xinh Nguyen";
    /**
     * The project contact URL.
     */
    public static final String PROJECT_CONTACT_URL = "https://twitter.com/nguyentrucxinh";

    /**
     * Create a Contact class to be used by Springfox's Swagger API Documentation framework.
     *
     * @return A Contact instance.
     */
    private Contact contact() {
        return new Contact(PROJECT_CONTACT_NAME, PROJECT_CONTACT_URL, null);
    }

    /**
     * Create an ApiInfo class to be used by Springfox's Swagger API Documentation framework.
     *
     * @return An ApiInfo instance.
     */
    private ApiInfo apiInfo() {

        // @formatter:off
        return new ApiInfoBuilder()
                .title("Project Skeleton for Spring Boot Web Services")
                .description("The Spring Boot web services starter project provides a foundation "
                        + "to rapidly construct a RESTful web services application.")
                .contact(contact())
                .version(PROJECT_VERSION)
                .license("api.license")
                .licenseUrl("api.license.url")
                .termsOfServiceUrl("api.tos")
                .build();
        // @formatter:on

    }

    /**
     * Create a Docket class to be used by Springfox's Swagger API Documentation framework. See
     * http://springfox.github.io/springfox/ for more information.
     *
     * @return A Docket instance.
     */
    @Bean
    public Docket docket() {
        final Predicate<String> paths = PathSelectors.ant("/api/**")::apply;

        // @formatter:off
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.xinhnguyen.web.controller"))
                .paths(paths::test)
                .build();
        // @formatter:on

    }
}
