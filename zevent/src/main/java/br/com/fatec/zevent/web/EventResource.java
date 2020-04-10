package br.com.fatec.zevent;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EventResource {

    private final EventController eventController;

    public EventResource() {
        this.eventController = new EventController();
    }

    /**
     * {@code GET  /event} : get all the public events.
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of public events in body.
     */
    @GetMapping("/event")
    public ResponseEntity<List<Event>> getAllEvents() {
        System.out.println("REST request to get all the public events");
        List<Event> events = eventController.getAllPublicEvents();
        return ResponseEntity.ok().body(events);
    }

}
