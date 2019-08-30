package com.arrcen.web;

import com.arrcen.web.service.serviceImpl.dataServiceImpl;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.xml.ws.Endpoint;

@SpringBootApplication
@MapperScan("com.arrcen.web.mapper.*")
@EnableSwagger2
public class WorkApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(WorkApplication.class);
    }

    public static void main(String[] args) {

        SpringApplication.run(WorkApplication.class, args);

    }



}
