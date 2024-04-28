package com.ibrahim.todo.services;

import java.util.List;

import com.ibrahim.todo.dto.UserDto;

public interface UserService {

    UserDto save(UserDto user);

    List<UserDto> findAll();

    UserDto findById(Long id);

    void delete(Long id);

    UserDto login(UserDto user);
}