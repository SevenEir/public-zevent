package com.fatec.zevent.service.impl;

import com.fatec.zevent.DAO.EventDAO;
import com.fatec.zevent.DTO.Event.PublicEventItemDTO;
import com.fatec.zevent.model.Event;
import com.fatec.zevent.model.enumeration.EventTypeEnum;
import com.fatec.zevent.service.IEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EventServiceImpl implements IEventService {

    @Autowired
    private EventDAO repository;

    public List<PublicEventItemDTO> getAllPublicEvents() {
        List<PublicEventItemDTO> publicEvents = new ArrayList<>();
        for(PublicEventItemDTO event : repository.findByType(EventTypeEnum.PUBLIC)) {
            publicEvents.add(event);
        }
        return publicEvents;
    }

    public Event createEvent(Event event) {
        //TODO: Aqui vai precisar ser setado o usuário responsavel, que será o logado a partir do token
        repository.save(event);
        return event;
    }

    public Optional<Event> getEventById(String id) {
        return repository.findById(id);
    }

}