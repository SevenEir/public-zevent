package com.fatec.zevent.service;

import com.fatec.zevent.DTO.Event.PublicEventItemDTO;
import com.fatec.zevent.model.Event;

import java.util.List;
import java.util.Optional;

public interface IEventService {
    public List<PublicEventItemDTO> getAllPublicEvents();
    public Event createEvent(Event event);
    public Optional<Event> getEventById(String id);
    public boolean subscribeEvent(String id);
    public boolean deleteEvent(String id);
}
