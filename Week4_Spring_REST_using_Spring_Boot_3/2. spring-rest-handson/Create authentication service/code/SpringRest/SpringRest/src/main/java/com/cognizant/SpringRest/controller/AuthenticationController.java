package com.cognizant.SpringRest.controller;

import com.cognizant.SpringRest.security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class AuthenticationController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtil jwtUtil;

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(Authentication authentication) {
        String username = authentication.getName();
        String token = jwtUtil.generateToken(username);
        return Map.of("token", token);
    }

}

