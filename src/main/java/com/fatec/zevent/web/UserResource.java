package com.fatec.zevent.web;

import com.fatec.zevent.model.User;
import com.fatec.zevent.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;
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
    public ResponseEntity<User> createUser(@Valid @RequestBody User user) throws URISyntaxException {
        if(user.getId() != null) {
            return ResponseEntity.badRequest().body(user);
        }
        User savedUser = userService.createUser(user);
        return ResponseEntity.created(new URI("/api/event/" + savedUser.getId())).body(savedUser);
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
}
