package com.example.demo.service;


import com.example.demo.models.dto.response.UserResponseDTO;
import com.example.demo.models.entity.Location;
import com.example.demo.models.enums.Gender;
import org.springframework.data.domain.Page;

public interface SearchUserService {
    Page<UserResponseDTO> getAllUsersByParams(String nickname, String name, String lastname, int age, Location location, Gender gender, int pageNumber, int itemsOnPage);

    Page<UserResponseDTO> getUserByUserIdAndParams(Long id, String nickname, String name, String lastname, int age, Location location, Gender gender, int pageNumber, int itemsOnPage);

    Page<UserResponseDTO> getAllUsersByGroupIdAndParams(Long id, String nickname, String name, String lastname, int age, Location location, Gender gender, int pageNumber, int itemsOnPage);
}
