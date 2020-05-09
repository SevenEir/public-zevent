package com.fatec.zevent.utils;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public class ObjectGetter<T> {
    public Optional<T> getById(MongoRepository dao, String id) {
        return dao.findById(id);
    }
}
