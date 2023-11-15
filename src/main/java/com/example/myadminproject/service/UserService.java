package com.example.myadminproject.service;


import com.example.myadminproject.entity.UserEntity;
import com.example.myadminproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<UserEntity> findByUserId(String username) {
        return userRepository.findByUserId(username);
    }
}
