package com.kaheshan.dummy;


import com.kaheshan.dummy.config.HibernateConfig;
import com.kaheshan.dummy.model.Person;
import com.kaheshan.dummy.service.PersonService;
import org.hibernate.Session;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import javax.persistence.criteria.CriteriaBuilder;
import java.sql.SQLException;
import java.util.List;

/**
 * @author imssbora
 *
 */
public class MainApp {
   public static void main(String[] args) throws SQLException {
      AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(HibernateConfig.class);

      PersonService personService = context.getBean(PersonService.class);

      // Add Persons
//      personService.add(new Person("Sunil", "Bora", "suni.bora@example.com"));
//      personService.add(new Person("David", "Miller", "david.miller@example.com"));
//      personService.add(new Person("Sameer", "Singh", "sameer.singh@example.com"));
//      personService.add(new Person("Paul", "Smith", "paul.smith@example.com"));


      personService.delete(1);
      // Get Persons
      List<Person> persons = personService.listPersons();
      for (Person person : persons) {
         System.out.println("Id = "+person.getId());
         System.out.println("First Name = "+person.getFirstName());
         System.out.println("Last Name = "+person.getLastName());
         System.out.println("Email = "+person.getEmail());
         System.out.println();
      }

      context.close();
   }
}
