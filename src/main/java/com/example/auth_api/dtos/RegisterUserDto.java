package com.example.auth_api.dtos;

import lombok.Data;
import lombok.Setter;

@Data
@Setter
public class RegisterUserDto {
    private String email;

    private String password;

    private String fullName;

    // getters and setters here...
}