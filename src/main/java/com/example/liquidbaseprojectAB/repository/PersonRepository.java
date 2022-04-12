package com.example.liquidbaseprojectAB.repository;

import com.example.liquidbaseprojectAB.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {

}
