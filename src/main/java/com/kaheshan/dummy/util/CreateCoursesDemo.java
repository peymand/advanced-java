package com.kaheshan.dummy.util;


import com.kaheshan.dummy.entities.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateCoursesDemo {

    public static void main(String[] args) {

        // create session factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Course.class)
                .addAnnotatedClass(Student.class)
                .addAnnotatedClass(Review.class)
                .buildSessionFactory();

        // create session
        Session session = factory.getCurrentSession();

        try {

            // start a transaction
            session.beginTransaction();

            // get the instructor from db
            int theId = 1;
            Instructor tempInstructor =
                    new Instructor("ali", "ahmadi", "susan.public@luv2code.com");

            // create some courses
            Course tempCourse1 = new Course("Air Guitar - The Ultimate Guide");
            Course tempCourse2 = new Course("The Pinball Masterclass");

            // add courses to instructor
            tempInstructor.add(tempCourse1);
            tempInstructor.add(tempCourse2);

            session.save(tempInstructor);

            // save the courses
//			session.save(tempCourse1);
//			session.save(tempCourse2);
//
            // commit transaction
            session.getTransaction().commit();

            System.out.println("Done!");
        }catch (Exception e){
            System.out.println(e);
        }
        finally {

            // add clean up code
            session.close();

            factory.close();
        }
    }

}





