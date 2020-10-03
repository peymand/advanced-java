package com.kaheshan.dummy.service;

import com.kaheshan.dummy.dao.PersonDao;
import com.kaheshan.dummy.model.Person;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
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
   public void delete(int id) {
      userDao.delete(id);
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

}
