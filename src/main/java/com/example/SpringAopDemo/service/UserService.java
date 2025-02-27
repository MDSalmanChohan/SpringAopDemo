package com.example.SpringAopDemo.service;


import com.example.SpringAopDemo.model.User;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    private List<User> users = Arrays.asList(
            new User("1", "Salman", "ADMIN"),
            new User("2", "John Doe", "USER")
    );

    public User getUserById(String id) {
        return users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public List<User> getAllUsers() {
        return users;
    }
}

