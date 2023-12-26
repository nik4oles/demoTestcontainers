//package com.example.demo.controller;
//
//import org.springframework.boot.test.context.TestConfiguration;
//import org.springframework.context.annotation.Bean;
//import org.springframework.test.context.DynamicPropertyRegistry;
//import org.testcontainers.containers.PostgreSQLContainer;
//
//@TestConfiguration
//public class TestBeans {
//
//    @Bean
//    public PostgreSQLContainer<?> postgreSQLContainer(DynamicPropertyRegistry registry) {
//        var container = new PostgreSQLContainer<>("postgres:16");
//        registry.add("postgresql.driver", container::getDriverClassName);
//        return container;
//    }
//}
