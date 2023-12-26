package com.example.demo.models.dto.request;

import lombok.Data;

@Data
public class AlbumRequestDTO {
    private String name;
    private String description;
    private boolean isPrivate;
}
