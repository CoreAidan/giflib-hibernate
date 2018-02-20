package com.coreaidan.giflib.service;

import com.coreaidan.giflib.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User findByUserName(String username);
}
