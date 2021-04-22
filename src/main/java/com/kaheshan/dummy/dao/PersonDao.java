package com.kaheshan.dummy.dao;

import com.kaheshan.dummy.entities.Person;

import java.util.List;


public interface PersonDao {
   void save(Person person);
   void delete(Person p);
   void add(Person person);
   Person get(Long id);
   List<Person> listPersons();

    void update(Person p1);
}
