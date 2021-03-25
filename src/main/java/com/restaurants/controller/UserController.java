package com.restaurants.controller;

import com.restaurants.entity.User;
import com.restaurants.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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

    @GetMapping(path = "/find_all")
    public ResponseEntity<List<User>> findAll() {
        return new ResponseEntity<List<User>>(repository.findAll(), HttpStatus.OK);
    }

    @PostMapping(path = "/login")
    public ResponseEntity<User> login(@RequestBody User user) {
        return new ResponseEntity<User>(repository.find(user.getMail(), user.getPass()), HttpStatus.OK);
    }

    @PostMapping(path = "/save")
    public ResponseEntity<User> save(@RequestBody User user) {
        return new ResponseEntity<User>(repository.save(user), HttpStatus.OK);
    }

}
