package com.example.demo.models.dto.request;

import com.example.demo.models.enums.Emotion;
import lombok.Data;

@Data
public class LikeRequestDTO {
    private Emotion emotion;
}
