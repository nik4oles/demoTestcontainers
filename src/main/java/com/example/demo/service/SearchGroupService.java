package com.example.demo.service;

import com.example.demo.models.dto.response.GroupResponseDTO;
import org.springframework.data.domain.Page;

public interface SearchGroupService {
    Page<GroupResponseDTO> getAllGroupsByParams(String name, String description, int pageNumber, int itemsOnPage);

    Page<GroupResponseDTO> getGroupsByUserIdAndParams(Long id, String name, String description, int pageNumber, int itemsOnPage);
}
