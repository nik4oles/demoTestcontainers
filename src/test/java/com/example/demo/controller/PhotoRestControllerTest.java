package com.example.demo.controller;

import com.example.demo.DemoApplication;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
class PhotoRestControllerTest {

    @Autowired
    private WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;

    @BeforeEach
    private void init() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    void getPhoto() throws Exception {

        mockMvc.perform(get("/photos/{id}", 8L))
                .andExpect(status().isOk());
    }

    @Test
    void deletePhoto() throws Exception {

        mockMvc.perform(delete("/photos/{id}", 2L))
                .andExpect(status().isOk());
    }

    @Test
    void addLikePhoto() throws Exception {

        mockMvc.perform(post("/photos/{id}/likes/", 7L)
                        .contentType(MediaType.APPLICATION_JSON)
                        .param("userId", String.valueOf(5L)))
                .andExpect(status().isOk());
    }

}