package com.fatec.zevent.service;

import com.fatec.zevent.DTO.Stand.StandToAddDTO;
import com.fatec.zevent.model.Event;

public interface IStandService {
    public Event addStandToEvent(StandToAddDTO standToAddDTO);
}
