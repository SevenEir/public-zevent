package com.fatec.zevent.web;

import com.fatec.zevent.DTO.Event.PublicEventItemDTO;
import com.fatec.zevent.controller.EventController;
import com.fatec.zevent.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;
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

    /**
     * {@code POST  /event} : create new event.
     *
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and the event created.
     */
    @PostMapping("/event")
    public ResponseEntity<Event> createEvent(@Valid @RequestBody Event event) throws URISyntaxException {
        if(event.getId() != null) {
            return ResponseEntity.badRequest().body(event);
        }
        Event savedEvent = eventController.createEvent(event);
        return ResponseEntity.created(new URI("/api/event/" + savedEvent.getId())).body(savedEvent);
    }
}
