package com.coreaidan.giflib.service;

import com.coreaidan.giflib.dao.UserDao;
import com.coreaidan.giflib.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User findByUserName(String username) {
        return userDao.findByUserName(username);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Load user from the database (throw exception if not found)
        User user = userDao.findByUserName(username);
        if(user == null){
            throw new UsernameNotFoundException("User not found");
        }
        //Return user object
        return user;
    }
}
