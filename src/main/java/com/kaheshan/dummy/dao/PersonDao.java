package com.kaheshan.dummy.dao;

import com.kaheshan.dummy.model.Person;

import java.util.List;


public interface PersonDao {
   void add(Person person);
   List<Person> listPersons();
}
