package com.fatec.zevent.service;

import com.fatec.zevent.model.Evento;

import java.util.List;
import java.util.Optional;

public interface IEventService {
    public List<Evento> getAllPublicEvents();
    public Evento createEvent(Evento evento);
    public Optional<Evento> getEventById(String id);
}
