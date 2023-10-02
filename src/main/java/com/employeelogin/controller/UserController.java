package com.employeelogin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeelogin.entities.User;
import com.employeelogin.services.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;
    

    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
    	return userService.registerUser(user);
    }
    @PostMapping("/login")
    public User loginUser(@RequestBody User user) {
    	return userService.loginUser(user);
    }
}

