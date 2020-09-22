package com.kaheshan.dummy.service;


import com.kaheshan.dummy.model.Person;

import java.util.List;

public interface PersonService {
    void add(Person person);
    void delete(int id);
    List<Person> listPersons();
}
