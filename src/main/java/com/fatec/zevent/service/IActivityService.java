package com.fatec.zevent.service;

import com.fatec.zevent.DTO.Activity.ActivityToAddDTO;
import com.fatec.zevent.model.Evento;

public interface IActivityService {
    public Evento addActivityToEvent(ActivityToAddDTO activityToAddDTO);
}
