package com.jwt.jwtDemo.controller;

import com.jwt.jwtDemo.model.LoginRequest;
import com.jwt.jwtDemo.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthController {

    @Autowired
    private AuthenticationManager authManager;

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/authenticate")
    public String generateToken(@RequestBody LoginRequest loginRequest) {

        try {
            Authentication auth = authManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            loginRequest.getUsername(),
                            loginRequest.getPassword()
                    )
            );

            if (auth.isAuthenticated()) {
                return jwtUtil.generateToken(loginRequest.getUsername());
            } else {
                throw new BadCredentialsException("Invalid credentials!");
            }

        } catch (BadCredentialsException ex) {
            throw new RuntimeException("Invalid username or password");
        }
    }
}
