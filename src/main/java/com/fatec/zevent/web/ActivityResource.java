package com.fatec.zevent.web;

import com.fatec.zevent.DTO.Activity.ActivityToAddDTO;
import com.fatec.zevent.model.Event;
import com.fatec.zevent.model.User;
import com.fatec.zevent.service.IActivityService;
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
public class ActivityResource {

    @Autowired
    private IActivityService activityService;

    /**
     * {@code POST  /activity} : create new activity.
     *
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and the activity created.
     */
    @PostMapping("/activity")
    public ResponseEntity<Map<String, Object>> createActivity(@Valid @RequestBody ActivityToAddDTO activityToAddDTO) throws URISyntaxException {
        Event event = activityService.addActivityToEvent(activityToAddDTO);
        Map<String, Object> response = new HashMap<String, Object>();

        if(event == null) {
        	response.put("status_code", 400);
        	response.put("status_message", "Ocorreu um erro ao fazer a requisição");
        	response.put("data", event);
            return ResponseEntity.badRequest().body(response);
        } else {
        	response.put("data", event);
        	response.put("status", 200);
        	response.put("status_message", "OK");
            return ResponseEntity.created(new URI("/api/event/" + event.getId())).body(response);
        }
    }
}
