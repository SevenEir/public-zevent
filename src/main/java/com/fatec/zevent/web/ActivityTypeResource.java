package com.fatec.zevent.web;

import com.fatec.zevent.DTO.ActivityType.ActivityTypeToAddDTO;
import com.fatec.zevent.DTO.Stand.StandToAddDTO;
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
import java.util.HashMap;
import java.util.Map;

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
    public ResponseEntity<Map<String, Object>> createActivityType(@Valid @RequestBody ActivityTypeToAddDTO activityTypeToAddDTO) throws URISyntaxException {
        Event event = activityTypeService.addActivityTypeToEvent(activityTypeToAddDTO);
        Map<String, Object> response = new HashMap<String, Object>();

        response.put("data", event);
    	response.put("status", 200);
    	response.put("status_message", "OK");
        return ResponseEntity.created(new URI("/api/event/" + event.getId())).body(response);
    }
}
