package com.example.myadminproject.service;

import com.example.myadminproject.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // 여기서는 예시를 위해 하드코딩된 사용자 정보를 사용합니다.
        // 실제로는 데이터베이스나 다른 저장소에서 사용자 정보를 조회해야 합니다.
        if (username.equals("test")) {
            return new User("test", "pw", "ROLE_USER");
        } else {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
    }
}
