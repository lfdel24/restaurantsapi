package com.restaurants.controller;

import com.restaurants.model.User;
import com.restaurants.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author leo
 */
@RestController
@RequestMapping(path = "/users")
public class UserController {

    @Autowired
    UserRepository repository;

    @GetMapping(path = "/users")
    public ResponseEntity<List<User>> findAll() {
        return new ResponseEntity<List<User>>(repository.findAll(), HttpStatus.OK);
    }

    @GetMapping(path = "/authenticate")
    public ResponseEntity<User> authenticate(@RequestBody User user) {
        return new ResponseEntity<User>(repository.find(user.getEmail(), user.getPass()), HttpStatus.OK);
    }

    @PostMapping(path = "/save")
    public ResponseEntity<User> save(@RequestBody User user) {
        return new ResponseEntity<User>(repository.save(user), HttpStatus.OK);
    }

}
