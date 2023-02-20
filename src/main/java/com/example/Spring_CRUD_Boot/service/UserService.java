package com.example.Spring_CRUD_Boot.service;

import com.example.Spring_CRUD_Boot.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void saveUser(User user);
    User getUser(int id);
    void updateUser(User user);
    void deleteUser(int id);
}
