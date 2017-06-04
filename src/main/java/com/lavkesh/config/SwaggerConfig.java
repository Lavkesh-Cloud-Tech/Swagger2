package com.lavkesh.config;

import java.util.ArrayList;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

  @Bean
  public Docket api() {
    return new Docket(DocumentationType.SWAGGER_2)
        .select()
        .apis(RequestHandlerSelectors.any())
        .paths(PathSelectors.ant("/api/**"))
        .build()
        .apiInfo(apiInfo());
  }

  private ApiInfo apiInfo() {
    Contact contact = contact();
    ApiInfo apiInfo =
        new ApiInfo(
            "Hello world example",
            "This is my first swagger example.",
            "0.0.1",
            "Terms of service",
            contact,
            "License of API",
            "API license URL",
            new ArrayList<>());
    return apiInfo;
  }

  private Contact contact() {
    Contact contact =
        new Contact(
            "Hello world example",
            "https://github.com/LavkeshSpringCloud",
            "myeaddress@company.com");
    return contact;
  }
}
