package com.kaheshan.dummy.dao;

import com.kaheshan.dummy.model.Person;

import java.util.List;


public interface PersonDao {
   void save(Person person);
   void delete(int id);
   void add(Person person);
   Person get(Long id);
   List<Person> listPersons();
}
