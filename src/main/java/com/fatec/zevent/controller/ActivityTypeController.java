package com.fatec.zevent.controller;

import com.fatec.zevent.DAO.EventDAO;
import com.fatec.zevent.DTO.ActivityType.ActivityTypeToAddDTO;
import com.fatec.zevent.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ActivityTypeController {

    @Autowired
    private EventDAO eventRepository;

    public Event addActivityTypeToEvent(ActivityTypeToAddDTO activityTypeToAddDTO) {
        Optional<Event> event = eventRepository.findById(activityTypeToAddDTO.getEventId());
        if(event.isPresent()) {
            activityTypeToAddDTO.getActivityType().setActivities(new ArrayList<>());
            event.get().getActivityTypes().add(activityTypeToAddDTO.getActivityType());
            eventRepository.save(event.get());
            return event.get();
        } else {
            return null;
        }
    }

}
