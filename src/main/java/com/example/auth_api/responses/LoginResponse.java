package com.example.auth_api.responses;

import lombok.Data;
import lombok.Getter;
@Data
@Getter
public class LoginResponse {
    private String token;
    private long expiresIn; // Assuming expiration time is in milliseconds

    public LoginResponse setToken(String token) {
        this.token = token;
        return this;
    }

    public LoginResponse setExpiresIn(long expiresIn) { // Setter method
        this.expiresIn = expiresIn;
        return this;
    }
}
