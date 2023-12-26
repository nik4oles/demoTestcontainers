package com.example.demo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.http.MediaType;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//@Testcontainers
@SpringBootTest
@AutoConfigureMockMvc
class UserRestControllerTest {

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Autowired
    private MockMvc mockMvc;

    //@BeforeEach
   // private void init() {
      //  mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    //}

//        @Container
//    @ServiceConnection
//    static PostgreSQLContainer<?> postgreSQLContainer =  new PostgreSQLContainer<>("postgres:16");
//
//    @DynamicPropertySource
//    static void postgreSqlProperties(DynamicPropertyRegistry registry) {
//        registry.add("postgresql.driver", postgreSQLContainer::getDriverClassName);
//    }


    @Test
    void createUser() throws Exception {
        String request = "{\"name\": \"TestContainer\", \"lastname\": \"TestContainer\", \"nickname\": \"@YYYYestContainer\", \"email\": \"user4@TestContainer\", \"password\": \"4444\", \"number\": 0, \"dateOfBirth\": null,\"gender\": null}";

        mockMvc.perform(post("/users")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(request))
                .andExpect(status().isOk());
    }

    @Test
    void getUserResponseDTO() throws Exception {

        mockMvc.perform(get("/users/{id}", 1L))
                .andExpect(status().isOk());
    }

    @Test
    void getUserResponseDTOnByNickname() throws Exception {

        mockMvc.perform(get("/users/nicknames/{nickname}", "@Nick1"))
                .andExpect(status().isOk());
    }

    @Test
    void updateUser() throws Exception {

        String request = "{\"name\": \"name1\", \"lastname\": \"lname1\", \"nickname\": \"@Nick1\", " +
                "\"email\": \"user1@skillbox.ru\", \"password\": \"1111\", \"shortStoryAboutUser\": null, " +
                "\"number\": 0, \"dateOfBirth\": null, \"gender\": \"NOT_SPECIFIED\", \"status\": null, " +
                "\"location\": {\"country\" : \"country1\", \"city\": \"city1\"}, \"private\": false}";

        mockMvc.perform(put("/users/{id}", 3L)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(request))
                .andExpect(status().isOk());
    }

    @Test
    void deleteUser() throws Exception {
        mockMvc.perform(delete("/users/{id}", 11L))
                .andExpect(status().isOk());

    }

    @Test
    void deleteUserByNickname() throws Exception {

        mockMvc.perform(delete("/users/nicknames/{nickname}", "@Nick6"))
                .andExpect(status().isOk());
    }

    @Test
    void subscribe() throws Exception {

        mockMvc.perform(post("/users/{id}/subscribe/{subscriberId}", 12L, 4L))
                .andExpect(status().isOk());
    }

    @Test
    void unsubscribe() throws Exception {

        mockMvc.perform(post("/users/{id}/unsubscribe/{subscriberId}", 12L, 4L))
                .andExpect(status().isOk());
    }

    @Test
    void createAlbum() throws Exception {

        String request = "{\"name\": \"createAlbumUser\", \"description\": \"hello\", \"date_creation\": null}";

        mockMvc.perform(post("/users/{id}/albums", 3L)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(request))
                .andExpect(status().isOk());
    }
}