package com.kaheshan.dummy.service;


import com.kaheshan.dummy.model.Person;

import java.util.List;

public interface PersonService {
    void add(Person person);
    List<Person> listPersons();
}
