package com.fatec.zevent.service.impl;

import com.fatec.zevent.DAO.EventDAO;
import com.fatec.zevent.DTO.Activity.ActivityToAddDTO;
import com.fatec.zevent.model.Evento;
import com.fatec.zevent.service.IActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActivityServiceImpl implements IActivityService {

    @Autowired
    private EventDAO eventRepository;

    @Override
    public Evento addActivityToEvent(ActivityToAddDTO activityToAddDTO) {
        /*
        Optional<Event> event = eventRepository.findById(activityToAddDTO.getEventId());
        activityToAddDTO.getActivity().setResponsibleIds(new ArrayList<>());
        activityToAddDTO.getActivity().setGuestsId(new ArrayList<>());
        if(event.isPresent()) {
            event.get().getActivityTypes().forEach(activityType -> {
                if(activityType.getName().equals(activityToAddDTO.getActivityTypeName())) {
                    activityType.getActivities().add(activityToAddDTO.getActivity());
                    eventRepository.save(event.get());
                }
            });
            return event.get();
        }*/
        return null;
    }

}
