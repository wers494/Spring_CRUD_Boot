package com.example.Spring_CRUD_Boot.service;

import com.example.Spring_CRUD_Boot.dao.UserDAO;
import com.example.Spring_CRUD_Boot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
    @Transactional(readOnly = true)
    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Transactional
    @Override
    public void saveUser(User user) {
        userDAO.saveUser(user);
    }

    @Transactional(readOnly = true)
    @Override
    public User getUser(int id) {
        return userDAO.getUser(id);
    }
    @Transactional
    @Override
    public void updateUser(User user) {
        userDAO.updateUser(user);
    }
    @Transactional
    @Override
    public void deleteUser(int id) {
        userDAO.deleteUser(id);
    }
}
