package com.example.demo.service;

import com.example.demo.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public boolean validateUser(User user) {
        // For demonstration purposes, we use hardcoded values.
        // In a real application, validate against a database or another system.
        return "user".equals(user.getUsername()) && "password".equals(user.getPassword());
    }
}
