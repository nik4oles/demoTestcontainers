package com.example.demo.models.dto.request;

import lombok.Data;

import java.net.URI;

@Data
public class PhotoRequestDTO {
    private URI uri;
    private String title;
}
