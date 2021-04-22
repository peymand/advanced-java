package com.kaheshan.dummy.service;


import com.kaheshan.dummy.entities.Person;

import java.util.List;

public interface PersonService {
    void add(Person person);
    void delete(Person p);
    List<Person> listPersons();

    Person getPerson(Long i);

    void update(Person p1);
}