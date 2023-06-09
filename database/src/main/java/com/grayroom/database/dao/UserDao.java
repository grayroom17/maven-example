package com.grayroom.database.dao;

import java.util.Optional;

import com.grayroom.database.entity.User;

public class UserDao {

    public Optional<User> findById(Long id) {
        User user = new User(id);
        return Optional.of(user);
    }
}
