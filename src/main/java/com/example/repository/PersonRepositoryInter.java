package com.example.repository;

import com.example.model.Person;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface PersonRepositoryInter {

    Flux<Person> findAll();
    Mono<Person> findById(Integer personId);
    Flux<Person> findByName(String name);
    Mono<Person> save(Person person);
    Flux<Person> saveAll(List<Person> personList);
    void delete(Integer personId);

}
