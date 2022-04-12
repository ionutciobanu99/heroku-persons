package com.example.liquidbaseprojectAB.controller;

import com.example.liquidbaseprojectAB.entity.Person;
import com.example.liquidbaseprojectAB.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/persons")
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping()
    public ResponseEntity<Person> add(@RequestBody Person person)
    {
        return new ResponseEntity<>(personService.add(person), HttpStatus.CREATED);
    }

}
