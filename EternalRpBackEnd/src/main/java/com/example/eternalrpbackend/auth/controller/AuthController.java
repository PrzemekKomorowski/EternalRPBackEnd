package com.example.eternalrpbackend.auth.controller;
import com.example.eternalrpbackend.auth.model.LoginRequest;
import com.example.eternalrpbackend.auth.model.LoginResponse;
import com.example.eternalrpbackend.auth.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
@CrossOrigin
public class AuthController {

    private final AuthService authService;

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/login")
    public ResponseEntity<LoginResponse> loginUser(@RequestBody LoginRequest loginRequest){
        LoginResponse user = authService.loginUser(loginRequest);
        return ResponseEntity.ok(user);
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/register")
    public ResponseEntity<LoginResponse> registerUser(@RequestBody LoginRequest loginRequest){
        LoginResponse user = authService.registerUser(loginRequest);
        return ResponseEntity.ok(user);
    }

//    @PostMapping
//    public void register(UserRequest userRequest){
//        authService.registerUser(userRequest);
//    }
}
