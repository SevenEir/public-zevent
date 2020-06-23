package com.fatec.zevent.web;

import com.fatec.zevent.service.IEventService;
import com.fatec.zevent.model.Evento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class EventResource {

    @Autowired
    private IEventService eventService;

    /**
     * {@code GET  /event} : get all the public events.
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of public events in body.
     */
    @GetMapping("/public-event")
    public ResponseEntity<List<Evento>> getAllPublicEvents() {
        System.out.println("REST request to get all the public events");
        List<Evento> eventos = eventService.getAllPublicEvents();
        return ResponseEntity.ok().body(eventos);
    }

    /**
     * {@code POST  /event} : create new event.
     *
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and the event created.
     */
    @PostMapping("/event")
    public ResponseEntity<Evento> createEvent(@Valid @RequestBody Evento evento) throws URISyntaxException {
        //if(event.getId() != null) {
        //    return ResponseEntity.badRequest().body(event);
        //}
        Evento savedEvento = eventService.createEvent(evento);
        return ResponseEntity.created(new URI("/api/event/" + savedEvento.getId())).body(savedEvento);
    }

    /**
     * {@code GET  /event/:id} : get a event by id.
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the event detail.
     */
    @GetMapping("/public-event/{id}")
    public ResponseEntity<Evento> getEventById(@PathVariable String id) {
        System.out.println("REST request to get event detail");
        Optional<Evento> event = eventService.getEventById(id);
        return event.map(value -> ResponseEntity.ok().body(value))
                .orElseGet(() -> new ResponseEntity(HttpStatus.NOT_FOUND));
    }
}
