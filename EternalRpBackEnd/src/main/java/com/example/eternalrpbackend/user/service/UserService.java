package com.example.eternalrpbackend.user.service;



import com.example.eternalrpbackend.user.model.UserRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;




}
