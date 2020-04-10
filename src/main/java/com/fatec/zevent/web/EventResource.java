package com.fatec.zevent.web;

import com.fatec.zevent.DTO.Event.PublicEventItemDTO;
import com.fatec.zevent.controller.EventController;
import com.fatec.zevent.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EventResource {

    @Autowired
    private final EventController eventController;

    public EventResource() {
        this.eventController = new EventController();
    }

    /**
     * {@code GET  /event} : get all the public events.
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of public events in body.
     */
    @GetMapping("/public-event")
    public ResponseEntity<List<PublicEventItemDTO>> getAllPublicEvents() {
        System.out.println("REST request to get all the public events");
        List<PublicEventItemDTO> events = eventController.getAllPublicEvents();
        return ResponseEntity.ok().body(events);
    }

}
