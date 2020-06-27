package com.fatec.zevent.DAO;


import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.fatec.zevent.model.Role;

public interface RoleDAO extends MongoRepository<Role, Long> {

    Optional<Role> findByName(String name);

}