package com.grayroom.service.service;

import java.util.Optional;

import com.grayroom.database.dao.UserDao;
import com.grayroom.service.dto.UserDto;

public class UserService {

    private final UserDao userDao = new UserDao();

    public Optional<UserDto> getUser(Long id) {
        return userDao.findById(id).map(user -> new UserDto(user.getId()));
    }
}
