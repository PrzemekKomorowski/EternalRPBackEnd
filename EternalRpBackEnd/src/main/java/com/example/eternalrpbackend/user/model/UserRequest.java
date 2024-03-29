package com.example.eternalrpbackend.user.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest {
    private String username;
    private String password;
    private String email;

     public static User toEntity(UserRequest request){
         return User.builder()
                 .username(request.getUsername())
                 .password(request.getPassword())
//                 .email(request.getEmail())
                 .build();
     }
}
