package com.example.demo.converter.user;

import com.example.demo.converter.DtoMapper;
import com.example.demo.models.dto.response.UserResponseDTO;
import com.example.demo.models.entity.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper extends DtoMapper<UserResponseDTO, User> {
    @Override
    UserResponseDTO toDto(User user);

    @Override
    List<UserResponseDTO> toDto(List<User> list);

}
