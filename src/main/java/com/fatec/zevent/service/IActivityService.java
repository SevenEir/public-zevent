package com.fatec.zevent.service;

import com.fatec.zevent.DTO.Activity.ActivityToAddDTO;
import com.fatec.zevent.model.Event;

public interface IActivityService {
    public Event addActivityToEvent(ActivityToAddDTO activityToAddDTO);
}
