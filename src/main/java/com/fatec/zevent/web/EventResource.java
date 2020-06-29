package com.fatec.zevent.web;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.zevent.DTO.Event.PublicEventItemDTO;
import com.fatec.zevent.model.Event;
import com.fatec.zevent.model.enumeration.RoleEnum;
import com.fatec.zevent.service.IEventService;

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

    //@PreAuthorize("hasAuthority(\'" + RoleEnum.ADMIN + "\')")
    @GetMapping("/public-event")
    public ResponseEntity<List<PublicEventItemDTO>> getAllPublicEvents() {
        System.out.println("REST request to get all the public events");
        List<PublicEventItemDTO> events = eventService.getAllPublicEvents();
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
        Event savedEvent = eventService.createEvent(event);
        return ResponseEntity.created(new URI("/api/event/" + savedEvent.getId())).body(savedEvent);
    }

    /**
     * {@code GET  /event/:id} : get a event by id.
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the event detail.
     */
    @GetMapping("/public-event/{id}")
    public ResponseEntity<Event> getEventById(@PathVariable String id) {
        System.out.println("REST request to get event detail");
        Optional<Event> event = eventService.getEventById(id);
        return event.map(value -> ResponseEntity.ok().body(value))
                .orElseGet(() -> new ResponseEntity(HttpStatus.NOT_FOUND));
    }
    
    @PreAuthorize("hasAuthority(\'" + RoleEnum.USER + "\')")
    @PostMapping("/event/subscribe/{id}")
    public ResponseEntity<Event> subscribeEvent(@PathVariable String id){
    	if (eventService.subscribeEvent(id)) 
    		return new ResponseEntity<Event>(HttpStatus.OK);
    	else
    		return new ResponseEntity<Event>(HttpStatus.BAD_REQUEST);
    }

    @PreAuthorize("hasAuthority(\'" + RoleEnum.EVENT_ADMIN+"\')")
    @DeleteMapping("/event/{id}")
    public ResponseEntity<Event> removeEvent(@PathVariable String id){
    	if (eventService.deleteEvent(id)) 
    		return new ResponseEntity<Event>(HttpStatus.OK);
    	else
    		return new ResponseEntity<Event>(HttpStatus.BAD_REQUEST);
    }
}
