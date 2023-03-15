package com.denis.course.Hibernate;

import com.denis.course.Hibernate.Entity.*;
import org.hibernate.*;
import org.hibernate.cfg.*;

import java.util.*;

public class HQL {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Workers.class)
                .buildSessionFactory();
// Without session, you can't do some operations with java objects
        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

//            List emps = session.createQuery("from Employee").getResultList(); // Get all employers
            List emps = session.createQuery("from Workers " + "where name = 'Denis' AND salary > 200").getResultList(); // Get by name
            System.out.println(" ");
            for (Object e : emps) {
                System.out.println(e);
            }
            System.out.println(" ");
            session.getTransaction().commit();

        } finally {
            factory.close();
        }
    }
}
