package com.example.demo.models.dto.request;

import lombok.Data;

@Data
public class UserDataRequestDTO {
    private String nickname;
    private String email;
    private String password;
    private String number;
}
