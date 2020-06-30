package com.fatec.zevent.web;

import com.fatec.zevent.DTO.Stand.StandToAddDTO;
import com.fatec.zevent.service.IStandService;
import com.fatec.zevent.model.Event;
import com.fatec.zevent.model.User;

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
public class StandResource {

    @Autowired
    private IStandService standService;

    /**
     * {@code POST  /stand} : create new stand.
     *
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and the stand created.
     */
    @PostMapping("/stand")
    public ResponseEntity<Map<String, Object>> createStand(@Valid @RequestBody StandToAddDTO standToAddDTO) throws URISyntaxException {
        Event event = standService.addStandToEvent(standToAddDTO);
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
