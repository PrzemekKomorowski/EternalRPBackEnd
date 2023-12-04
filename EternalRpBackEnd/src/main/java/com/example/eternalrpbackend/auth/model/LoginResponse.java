package com.example.eternalrpbackend.auth.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class LoginResponse {
    private String jwtTOKEN;
}
