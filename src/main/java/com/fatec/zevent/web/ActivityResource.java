package com.fatec.zevent.web;

import com.fatec.zevent.DTO.Activity.ActivityToAddDTO;
import com.fatec.zevent.controller.ActivityController;
import com.fatec.zevent.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping("/api")
public class ActivityResource {

    @Autowired
    private final ActivityController activityController;


    public ActivityResource(ActivityController activityController) {
        this.activityController = activityController;
    }

    /**
     * {@code POST  /activity} : create new activity.
     *
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and the activity created.
     */
    @PostMapping("/activity")
    public ResponseEntity<Event> createActivity(@Valid @RequestBody ActivityToAddDTO activityToAddDTO) throws URISyntaxException {
        Event event = activityController.addActivityToEvent(activityToAddDTO);
        if(event == null) {
            return ResponseEntity.badRequest().body(event);
        } else {
            return ResponseEntity.created(new URI("/api/event/" + event.getId())).body(event);
        }
    }
}
