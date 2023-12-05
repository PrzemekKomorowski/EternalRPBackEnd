package com.example.eternalrpbackend.auth.service;

import com.example.eternalrpbackend.auth.model.LoginRequest;
import com.example.eternalrpbackend.auth.model.LoginResponse;
import com.example.eternalrpbackend.user.model.Role;
import com.example.eternalrpbackend.user.model.User;
import com.example.eternalrpbackend.user.model.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;
    public LoginResponse loginUser(LoginRequest userRequest) {
        Optional<User> user = userRepository.findByUsername(userRequest.getUserName());
        if(user.isPresent()){
            System.out.println(user.get().getPassword());
        }

        return LoginResponse.builder().jwtTOKEN("OK_COŚ").build();
    }

    public LoginResponse registerUser(LoginRequest loginRequest) {
        User user = User.builder().username(loginRequest.getUserName()).password(loginRequest.getPassword()).roles(Role.USER).build();
        userRepository.save(user);
        return LoginResponse.builder().jwtTOKEN("OK_COŚ").build();
    }
}
