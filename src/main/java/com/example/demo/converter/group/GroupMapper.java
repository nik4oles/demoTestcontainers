package com.example.demo.converter.group;

import com.example.demo.converter.DtoMapper;
import com.example.demo.converter.EntityMapper;
import com.example.demo.models.dto.request.GroupRequestDTO;
import com.example.demo.models.dto.response.GroupResponseDTO;
import com.example.demo.models.entity.Group;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface GroupMapper extends DtoMapper<GroupResponseDTO, Group>, EntityMapper<GroupRequestDTO, Group> {
    GroupResponseDTO toDto(Group e);

    List<GroupResponseDTO> toDto(List<Group> list);

    @Override
    Group toEntity(GroupRequestDTO groupRequestDTO);

    List<Group> toEntity(List<GroupRequestDTO> list);
}
