package com.example.myadminproject.service;

import com.example.myadminproject.entity.UserEntity;
import com.example.myadminproject.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

    @Service
    public class CustomUserDetailsService implements UserDetailsService {
        private final UserService userService;

        @Autowired
    public CustomUserDetailsService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userEntity = userService.findByUserId(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found with username: " + username));

        return new User(userEntity.getUserId(), userEntity.getPasswordHash(), "ROLE_USER");
    }
}
