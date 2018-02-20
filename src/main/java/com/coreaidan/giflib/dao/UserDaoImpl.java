package com.coreaidan.giflib.dao;

import com.coreaidan.giflib.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public User findByUserName(String username) {
        Session session = sessionFactory.openSession();
        User user = session.get(User.class, username);
        session.close();
        return user;
    }
}
