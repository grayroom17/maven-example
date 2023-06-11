package com.grayroom;

import java.util.Optional;

import com.grayroom.service.dto.UserDto;
import com.grayroom.service.service.UserService;

public class Main {

    private static final UserService userService = new UserService();

    public static void main(String[] args) {
        Optional<UserDto> user = userService.getUser(25L);
        System.out.println(user);
    }
}