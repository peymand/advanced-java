package com.kaheshan.dummy;


import com.kaheshan.dummy.config.HibernateConfig;
import com.kaheshan.dummy.entities.Instructor;
import com.kaheshan.dummy.entities.Person;
import com.kaheshan.dummy.service.PersonService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

/**
 * @author imssbora
 *
 */
public class MainApp {


   public static void main(String[] args) throws SQLException {
      AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(HibernateConfig.class);


      SessionFactory factory = (SessionFactory) context.getBean("sessionFactory");
      Session session = factory.getCurrentSession();
      session.beginTransaction();
      Instructor instructor = session.get(Instructor.class, 1);

      System.out.println(instructor);
      session.getTransaction().commit();
      session.close();
      PersonService personService = context.getBean(PersonService.class);
      Person p1 = personService.getPerson(1L);
      personService.delete(p1);


      //      int size = CacheManager.ALL_CACHE_MANAGERS.get(0)
//              .getCache("com.kaheshan.dummy.model.Person").getSize();
//      System.out.println((size ==1) ? "true" : "false");

              // Add Persons
//      personService.add(new Person("Sunil", "Bora", "suni.bora@example.com"));
//
//
//
//
//
//      personService.add(new Person("David", "Miller", "david.miller@example.com"));
//      personService.add(new Person("Sameer", "Singh", "sameer.singh@example.com"));
//      personService.add(new Person("Paul", "Smith", "paul.smith@example.com"));
//

//      personService.delete(1);
      // Get Persons
//      List<Person> persons = personService.listPersons();
//      for (Person person : persons) {
//         System.out.println("Id = "+person.getId());
//         System.out.println("First Name = "+person.getFirstName());
//         System.out.println("Last Name = "+person.getLastName());
//         System.out.println("Email = "+person.getEmail());
//         System.out.println();
//      }

      context.close();
   }
}
