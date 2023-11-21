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
    public UserEntity registerNewUser(UserEntity user) throws Exception {
        if (userRepository.existsById(user.getUserId())) {
            // 동일한 userId를 가진 사용자가 이미 존재하는 경우, 예외를 던집니다.
            throw new Exception("User with ID " + user.getUserId() + " already exists.");
        }
        return userRepository.save(user);
    }
}
