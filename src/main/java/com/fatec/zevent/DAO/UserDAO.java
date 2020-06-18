package com.fatec.zevent.DAO;

import com.fatec.zevent.model.User;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserDAO extends MongoRepository<User, String> {

	Optional<User> findUserByEmail(String email);

}
