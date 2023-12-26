package com.example.demo.converter.group;

import com.example.demo.converter.EntityMapper;
import com.example.demo.models.dto.request.GroupRegistrationRequestDTO;
import com.example.demo.models.entity.Group;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface GroupRegistrationMapper extends EntityMapper<GroupRegistrationRequestDTO, Group> {
    @Override
    Group toEntity(GroupRegistrationRequestDTO d);
}
