package com.fatec.zevent.controller;

import com.fatec.zevent.DAO.EventDAO;
import com.fatec.zevent.DTO.Activity.ActivityToAddDTO;
import com.fatec.zevent.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ActivityController {

    @Autowired
    private EventDAO eventRepository;

    public Event addActivityToEvent(ActivityToAddDTO activityToAddDTO) {
        Optional<Event> event = eventRepository.findById(activityToAddDTO.getEventId());
        activityToAddDTO.getActivity().setResponsible(new ArrayList<>());
        if(event.isPresent()) {
            event.get().getActivityTypes().forEach(activityType -> {
                if(activityType.getName().equals(activityToAddDTO.getActivityTypeName())) {
                    activityType.getActivities().add(activityToAddDTO.getActivity());
                    eventRepository.save(event.get());
                }
            });
            return event.get();
        }
        return null;
    }

}
