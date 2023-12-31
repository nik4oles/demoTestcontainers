package com.example.demo.models.dto.request;

import com.example.demo.models.enums.Gender;
import lombok.Data;

import java.time.LocalDate;

@Data
public class UserRegistrationRequestDTO {
    private String name;
    private String lastname;
//    @NotBlank
//    @Pattern(regexp = "^@.*$")
//    @Min(4)
    private String nickname;
    private String email;
    private String password;
    private short number;
    private LocalDate dateOfBirth;
    private Gender gender;

}
