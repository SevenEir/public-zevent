package com.fatec.zevent.service;

import com.fatec.zevent.DTO.ActivityType.ActivityTypeToAddDTO;
import com.fatec.zevent.model.Evento;

public interface IActivityTypeService {
    public Evento addActivityTypeToEvent(ActivityTypeToAddDTO activityTypeToAddDTO);
}
