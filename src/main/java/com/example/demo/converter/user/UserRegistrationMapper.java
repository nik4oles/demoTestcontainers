package com.example.demo.converter.user;

import com.example.demo.converter.EntityMapper;
import com.example.demo.models.dto.request.UserRegistrationRequestDTO;
import com.example.demo.models.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserRegistrationMapper extends EntityMapper<UserRegistrationRequestDTO, User> {
    @Override
    User toEntity(UserRegistrationRequestDTO userDTO);
}
