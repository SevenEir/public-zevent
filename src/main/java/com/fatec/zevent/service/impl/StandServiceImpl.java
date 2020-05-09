package com.fatec.zevent.service.impl;

import com.fatec.zevent.DAO.EventDAO;
import com.fatec.zevent.DTO.Stand.StandToAddDTO;
import com.fatec.zevent.model.Event;
import com.fatec.zevent.service.IStandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StandServiceImpl implements IStandService {

    @Autowired
    private EventDAO eventRepository;

    public Event addStandToEvent(StandToAddDTO standToAddDTO) {
        Optional<Event> event = eventRepository.findById(standToAddDTO.getEventId());
        if(event.isPresent()) {
            event.get().getStands().add(standToAddDTO.getStand());
            eventRepository.save(event.get());
            return event.get();
        } else {
            return null;
        }
    }
}
