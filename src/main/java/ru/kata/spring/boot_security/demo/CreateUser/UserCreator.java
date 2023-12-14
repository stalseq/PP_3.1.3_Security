package ru.kata.spring.boot_security.demo.CreateUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.kata.spring.boot_security.demo.model.User;
import ru.kata.spring.boot_security.demo.service.UserService;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@Component
public class UserCreator {
    private UserService userService;

    @Autowired
    public void Createuser(UserService userService) {
        this.userService = userService;
    }

    @PostConstruct
    public void createUser() {
        User user = new User("admin", "admin", "Alexandr", "Petrov", 33
                , "Alex@gmail.com", Arrays.asList("ROLE_ADMIN"));

        User user1 = new User("user", "user", "Ruslan", "Belov", 36
                , "Belov@gmail.com", Arrays.asList("ROLE_USER"));


        userService.saveUser(user);
        userService.saveUser(user1);
    }

}
