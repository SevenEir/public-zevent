package com.fatec.zevent.service;

import com.fatec.zevent.DTO.Stand.StandToAddDTO;
import com.fatec.zevent.model.Evento;

public interface IStandService {
    public Evento addStandToEvent(StandToAddDTO standToAddDTO);
}