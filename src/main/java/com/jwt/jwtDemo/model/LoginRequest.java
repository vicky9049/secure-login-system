package com.jwt.jwtDemo.model;


import lombok.*;
@Data
@Getter
@Setter
public class LoginRequest {
    private String username;
    private String password;


}
