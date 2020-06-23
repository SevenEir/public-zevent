package com.fatec.zevent.web;

import com.fatec.zevent.DTO.Activity.ActivityToAddDTO;
import com.fatec.zevent.model.Evento;
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
    public ResponseEntity<Evento> createActivity(@Valid @RequestBody ActivityToAddDTO activityToAddDTO) throws URISyntaxException {
        Evento evento = activityService.addActivityToEvent(activityToAddDTO);
        if(evento == null) {
            return ResponseEntity.badRequest().body(evento);
        } else {
            return ResponseEntity.created(new URI("/api/event/" + evento.getId())).body(evento);
        }
    }
}
