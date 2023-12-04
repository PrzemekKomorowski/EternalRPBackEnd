package com.example.eternalrpbackend.auth.service;

import com.example.eternalrpbackend.auth.model.LoginRequest;
import com.example.eternalrpbackend.auth.model.LoginResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    public LoginResponse loginUser(LoginRequest userRequest) {
        System.out.println(userRequest.getUserName());
        System.out.println(userRequest.getPassword());
        return LoginResponse.builder().jwtTOKEN("OK_COŚ").build();
    }
}
