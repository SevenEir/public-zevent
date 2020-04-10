package com.fatec.zevent.controller;

import com.fatec.zevent.DAO.EventDAO;
import com.fatec.zevent.DTO.Event.PublicEventItemDTO;
import com.fatec.zevent.model.Activity;
import com.fatec.zevent.model.Event;
import com.fatec.zevent.model.enumeration.EventStatusEnum;
import com.fatec.zevent.model.enumeration.EventTypeEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventController {

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
        event.setStatus(EventStatusEnum.OPEN);
        //TODO: Aqui vai precisar ser setado o usuário responsavel, que será o logado a partir do token
        event.setActivities(new ArrayList<>());
        event.setStands(new ArrayList<>());
        event.setActivityTypes(new ArrayList<>());
        event.setComments(new ArrayList<>());
        repository.save(event);
        return event;
    }

}