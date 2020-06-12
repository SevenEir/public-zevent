package com.fatec.zevent.service.impl;

import com.fatec.zevent.DAO.UserDAO;
import com.fatec.zevent.model.User;
import com.fatec.zevent.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    UserDAO repository;

    @Override
    public User createUser(User user) {
        return repository.save(user);
    }

    @Override
    public Optional<User> getUserById(String id) {
        return repository.findById(id);
    }
}
