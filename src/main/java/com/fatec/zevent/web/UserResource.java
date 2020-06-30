package com.fatec.zevent.web;

import com.fatec.zevent.config.SecurityConfiguration;
import com.fatec.zevent.model.User;
import com.fatec.zevent.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class UserResource {

    @Autowired
    private IUserService userService;

    /**
     * {@code POST  /user} : create new user.
     *
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and the user created.
     */
    @PostMapping("/user")
    public ResponseEntity<Map<String, Object>> createUser(@Valid @RequestBody User user) throws URISyntaxException {
        Map<String, Object> response = new HashMap<String, Object>();
    	if(user.getId() != null) {
    		response.put("status_code", 400);
        	response.put("status_message", "Ocorreu um erro ao fazer a requisição");
            return ResponseEntity.badRequest().body(response);
        }
        User savedUser = userService.createUser(user);
     	response.put("data", savedUser);
    	response.put("status", 200);
    	response.put("status_message", "OK");
        return ResponseEntity.created(new URI("/api/event/" + savedUser.getId())).body(response);
    }

    /**
     * {@code GET  /event/:id} : get a user by id.
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the user detail.
     */
    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUserById(@PathVariable String id) {
        System.out.println("REST request to get user detail");
        Optional<User> user = userService.getUserById(id);
        return user.map(value -> ResponseEntity.ok().body(value))
                .orElseGet(() -> new ResponseEntity(HttpStatus.NOT_FOUND));
    }


    @GetMapping("/user/get-actual-user")
    public ResponseEntity<User> getUserLogged(){
    	User user = userService.getUserByEmail(SecurityConfiguration.gettingActualUser());
    return ResponseEntity.ok().body(user);
    }


}
