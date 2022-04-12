package com.example.liquidbaseprojectAB.service;

import com.example.liquidbaseprojectAB.entity.Person;
import com.example.liquidbaseprojectAB.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person add(Person person) {
        return personRepository.save(person);
    }
}
