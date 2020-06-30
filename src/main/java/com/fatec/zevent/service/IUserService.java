package com.fatec.zevent.service;

import com.fatec.zevent.model.User;

import java.util.Optional;

public interface IUserService {
    public User createUser(User user);
    public Optional<User> getUserById(String id);
    public User getUserByEmail(String email);
}
