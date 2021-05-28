package com.example.user.controller;

import com.example.user.domain.User;
import com.example.user.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepository repository;

    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    @GetMapping("")
    public Iterable<User> list() {
        return this.repository.findAll();
    }

    @PostMapping("")
    public User create(@RequestBody User user) {
        return this.repository.save(user);
    }
}
