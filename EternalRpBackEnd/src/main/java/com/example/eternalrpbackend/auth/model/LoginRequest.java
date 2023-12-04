package com.example.eternalrpbackend.auth.model;

import lombok.Builder;
import lombok.Data;

@Data
public class LoginRequest {
    private String userName;
    private String password;
}
