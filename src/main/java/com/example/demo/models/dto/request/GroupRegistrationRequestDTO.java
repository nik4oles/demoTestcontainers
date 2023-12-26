package com.example.demo.models.dto.request;

import com.example.demo.models.entity.Photo;
import lombok.Data;


@Data
public class GroupRegistrationRequestDTO {
    private String name;
    private String description;
    private long ownerId;
    private Photo profilePicture;
    private String shortStoryAboutGroup;
    private boolean isPrivate;
}
