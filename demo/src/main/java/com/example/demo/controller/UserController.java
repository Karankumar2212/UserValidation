package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")  // Allows cross-origin requests from any domain
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/validateUser")
    public String validateUser(@RequestBody User user) {
        if (userService.validateUser(user)) {
            return "User is valid";
        } else {
            return "Invalid user";
        }
    }
}
