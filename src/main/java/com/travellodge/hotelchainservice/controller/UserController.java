package com.travellodge.hotelchainservice.controller;

import com.travellodge.hotelchainservice.domain.User;
import com.travellodge.hotelchainservice.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController("/api/user")
public class UserController {
    private UserService userService;

    @Inject
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user")
    public User createUser(@RequestBody User user ) {
        userService.addUser(user);
        return user;
    }
}
