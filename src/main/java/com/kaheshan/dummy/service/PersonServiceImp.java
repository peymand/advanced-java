package com.kaheshan.dummy.service;

import com.kaheshan.dummy.dao.PersonDao;
import com.kaheshan.dummy.entities.Person;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Peyman
 *
 */
@Service
@AllArgsConstructor
public class PersonServiceImp implements PersonService {


   private PersonDao userDao;

   @Transactional
   @Override
   public void add(Person person) {
      userDao.add(person);
   }

   @Transactional
   @Override
   public void delete(Person p) {
      userDao.delete(p);
   }

   @Transactional(readOnly = true)
   @Override
   public List<Person> listPersons() {
      return userDao.listPersons();
   }

   @Override
   @Transactional(readOnly = true)
   public Person getPerson(Long i) {
      return userDao.get(i);
   }

   @Transactional
   @Override
   public void update(Person p1) {
      userDao.update(p1);
   }

}
