package com.example.demo.models.dto.response;

import com.example.demo.models.enums.Emotion;
import lombok.Data;

@Data
public class LikeResponseDTO {
    private Long id;
    private UserResponseDTO user;
    private Emotion emotion;
}
