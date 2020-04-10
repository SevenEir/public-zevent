package com.fatec.zevent.DAO;

import com.fatec.zevent.model.Event;
import com.fatec.zevent.model.enumeration.EventTypeEnum;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventDAO extends MongoRepository<Event, String> {
    public List<Event> findByType(EventTypeEnum type);
}
