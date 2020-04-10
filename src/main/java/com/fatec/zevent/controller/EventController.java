package com.fatec.zevent.controller;

import com.fatec.zevent.model.Event;

import java.util.ArrayList;
import java.util.List;

public class EventController {

    public List<Event> getAllPublicEvents() {
        Event event = new Event();
        List<Event> events = new ArrayList<>();
        events.add(event);
        return events;
    }

}