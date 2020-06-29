package com.fatec.zevent.DAO;

import com.fatec.zevent.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserDAO extends MongoRepository<User, String> {
    User findByEmail(String email);
}
