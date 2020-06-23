package com.fatec.zevent.service.impl;

import com.fatec.zevent.DAO.EventDAO;
import com.fatec.zevent.DTO.ActivityType.ActivityTypeToAddDTO;
import com.fatec.zevent.model.Evento;
import com.fatec.zevent.service.IActivityTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActivityTypeServiceImpl implements IActivityTypeService {

    @Autowired
    private EventDAO eventRepository;

    public Evento addActivityTypeToEvent(ActivityTypeToAddDTO activityTypeToAddDTO) {
        return null;
        /*
        Optional<Event> event = eventRepository.findById(activityTypeToAddDTO.getEventId());
        if(event.isPresent()) {
            activityTypeToAddDTO.getActivityType().setActivities(new ArrayList<>());
            event.get().getActivityTypes().add(activityTypeToAddDTO.getActivityType());
            eventRepository.save(event.get());
            return event.get();
        } else {
            return null;
        }*/
    }

}
