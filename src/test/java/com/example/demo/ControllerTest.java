//package com.example.demo;

//import org.junit.Assert;
import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
//import org.springframework.core.env.Environment;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.DynamicPropertyRegistry;
//import org.springframework.test.context.DynamicPropertySource;
//import org.springframework.test.web.servlet.MockMvc;
//import org.testcontainers.containers.PostgreSQLContainer;
//import org.testcontainers.junit.jupiter.Container;
//import org.testcontainers.junit.jupiter.Testcontainers;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

//@Testcontainers
//@SpringBootTest
//@AutoConfigureMockMvc
//class ControllerTest {
//
//    @Container
//    @ServiceConnection
//    static PostgreSQLContainer<?> postgreSQLContainer =  new PostgreSQLContainer<>("postgres:16");
//
//    @DynamicPropertySource
//    static void postgreSqlProperties(DynamicPropertyRegistry registry) {
//        registry.add("postgresql.driver", postgreSQLContainer::getDriverClassName);
//    }
//    @Autowired
//    MockMvc mockMvc;
//
//    @Autowired
//    Environment environment;
//
//    @Test
//    void getUser() throws Exception {
//        assertEquals("org.postgresql.Driver", environment.getProperty("postgresql.driver"));
//        this.mockMvc.perform(get("/users")).andExpectAll(
//                status().isOk(),
//                content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON),
//                content().json("""
//                            [
//                                {"id": 1, "fname": "User1"},
//                                {"id": 2, "fname": "User2"},
//                                {"id": 3, "fname": "User3"}
//                            ]
//                        """
//
//                )
//        );
//    }
//}