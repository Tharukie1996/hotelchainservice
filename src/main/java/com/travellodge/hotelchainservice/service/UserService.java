package com.travellodge.hotelchainservice.service;

import com.travellodge.hotelchainservice.domain.User;
import com.travellodge.hotelchainservice.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service
public class UserService {

    private UserRepository userRepository;

    @Inject
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User addUser(User user) {
        userRepository.insert(user);
        return user;
    }
}
