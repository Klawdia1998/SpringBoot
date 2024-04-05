package com.itmentor.springboot.service;

import jakarta.validation.Valid;
import com.itmentor.springboot.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    Object getUserById(long id);

    void addUser(User user);

    void removeUser(long id);

    void updateUser(@Valid User user);
}