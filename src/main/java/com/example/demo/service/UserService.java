package com.example.demo.service;

import com.example.demo.models.dto.request.UserDataRequestDTO;
import com.example.demo.models.dto.request.UserRegistrationRequestDTO;
import com.example.demo.models.dto.request.UserRequestDTO;
import com.example.demo.models.dto.response.AlbumResponseDTO;
import com.example.demo.models.dto.response.GroupResponseDTO;
import com.example.demo.models.dto.response.UserResponseDTO;
import com.example.demo.models.entity.User;

import java.util.List;

public interface UserService {


    UserResponseDTO createUser(UserRegistrationRequestDTO userDTO);

    User getUser(long id);

    UserResponseDTO getUserResponseDTO(long id);

    UserResponseDTO getUserResponseDTOByNickname(String nickname);

    UserResponseDTO updateUser(UserRequestDTO userDTO, long id);

    String updateData(UserDataRequestDTO user, long id);

    void addStoryAboutUser(long id, String story);

    void closeAccount(long id, boolean b);

    void status(long id, String status);
    String deleteUserByNickname(String nickname);

    String deleteUser(long id);

    String subscribe(long id, long subscriberId);

    String unsubscribe(long id, long subscriberId);

    List<GroupResponseDTO> getGroupList(Long userId);

    List<UserResponseDTO> getSubscribersList(Long userId);

    List<AlbumResponseDTO> getAlbumList(Long userId);

    void deleteRoleFromUser(Long userId, Long roleId);

    void addRoleToUser(Long userId, Long roleId);
}
