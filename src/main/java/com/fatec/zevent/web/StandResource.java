package com.fatec.zevent.web;

import com.fatec.zevent.DTO.Stand.StandToAddDTO;
import com.fatec.zevent.service.IStandService;
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
public class StandResource {

    @Autowired
    private IStandService standService;

    /**
     * {@code POST  /stand} : create new stand.
     *
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and the stand created.
     */
    @PostMapping("/stand")
    public ResponseEntity<Event> createStand(@Valid @RequestBody StandToAddDTO standToAddDTO) throws URISyntaxException {
        Event event = standService.addStandToEvent(standToAddDTO);
        if(event == null) {
            return ResponseEntity.badRequest().body(event);
        } else {
            return ResponseEntity.created(new URI("/api/event/" + event.getId())).body(event);
        }
    }
}
