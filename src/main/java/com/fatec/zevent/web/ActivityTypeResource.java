package com.fatec.zevent.web;

import com.fatec.zevent.DTO.ActivityType.ActivityTypeToAddDTO;
import com.fatec.zevent.service.IActivityTypeService;
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
public class ActivityTypeResource {

    @Autowired
    private IActivityTypeService activityTypeService;

    /**
     * {@code POST  /activity-type} : create new activity type.
     *
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and the activity type created.
     */
    @PostMapping("/activity-type")
    public ResponseEntity<Event> createActivityType(@Valid @RequestBody ActivityTypeToAddDTO activityTypeToAddDTO) throws URISyntaxException {
        Event event = activityTypeService.addActivityTypeToEvent(activityTypeToAddDTO);
        return ResponseEntity.created(new URI("/api/event/" + event.getId())).body(event);
    }

}
