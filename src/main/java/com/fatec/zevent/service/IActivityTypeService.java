package com.fatec.zevent.service;

import com.fatec.zevent.DTO.ActivityType.ActivityTypeToAddDTO;
import com.fatec.zevent.model.Event;

public interface IActivityTypeService {
    public Event addActivityTypeToEvent(ActivityTypeToAddDTO activityTypeToAddDTO);
}
