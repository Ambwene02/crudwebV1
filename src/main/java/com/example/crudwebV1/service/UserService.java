package com.example.crudwebV1.service;

import com.example.crudwebV1.Entity.User;

import java.util.List;

public interface UserService {

    User createUser(User user);
    User getUserById(Long userId);
    List<User> getAllUsers();
    User updateUser(User user);
    void deleteUser(Long userId);
}