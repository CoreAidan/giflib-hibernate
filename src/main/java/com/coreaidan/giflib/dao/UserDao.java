package com.coreaidan.giflib.dao;

import com.coreaidan.giflib.model.User;

public interface UserDao {
    User findByUserName(String username);
}
