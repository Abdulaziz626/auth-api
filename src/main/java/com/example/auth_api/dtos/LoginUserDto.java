package com.example.auth_api.dtos;

import lombok.Data;

@Data
public class LoginUserDto {
    private String email;

    private String password;

    // getters and setters here...
}
