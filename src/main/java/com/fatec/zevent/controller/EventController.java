package com.fatec.zevent.controller;

import com.fatec.zevent.model.Event;

import java.util.ArrayList;
import java.util.List;

public class EventController {

    public List<Event> getAllPublicEvents() {
        Event event = new Event();
        event.setName("Google Cloud");
        event.setDesc("Evento da google para realizar festa de TI");
        List<Event> events = new ArrayList<>();
        events.add(event);
        return events;
    }

}