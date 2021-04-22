package com.kaheshan.dummy.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.kaheshan.dummy.entities.Person;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



/**
 * @author Peyman
 *
 */
@Repository
public class PersonDaoImp implements PersonDao {

   @PersistenceContext
   private EntityManager em;


   @Autowired
   SessionFactory sessionFactory;

   @Override
   public void save(Person person) {

   }

   @Override
   public void delete(Person p) {
      em.remove(p);
   }

   @Override
   public void add(Person person) {


      em.persist(person);
   }

   @Override
   public Person get(Long id) {
      return em.find(Person.class,id);
   }

   @Override
   public List<Person> listPersons() {

      List<Person> people = sessionFactory.getCurrentSession().createQuery("from Person p").list();

      Query nativeQuery = em.createQuery("SELECT s from Person s");
      List<Person> result = nativeQuery.getResultList();
      return result;
//      CriteriaQuery<Person> criteriaQuery = em.getCriteriaBuilder().createQuery(Person.class);
//      @SuppressWarnings("unused")
//      Root<Person> root = criteriaQuery.from(Person.class);
//      return em.createQuery(criteriaQuery).getResultList();
   }

   @Override
   public void update(Person p1) {
      em.merge(p1);
   }

}
