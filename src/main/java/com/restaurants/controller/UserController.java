package com.restaurants.controller;

import com.restaurants.model.User;
import com.restaurants.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

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

    @GetMapping(path = "find-all")
    public ResponseEntity<List<User>> user() {
        return new ResponseEntity<List<User>>(repository.findAll(), HttpStatus.OK);
    }

}
