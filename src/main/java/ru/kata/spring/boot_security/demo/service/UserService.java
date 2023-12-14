package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);

    List<User> getAllUsers();

    void deleteUser(Long id);

    void editUser(Long id, User user);

    void updateUser(User user, Long id);

    User getUser(Long id);

    User getUserByUsername(String username);

}
