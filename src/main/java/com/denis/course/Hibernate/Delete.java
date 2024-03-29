package com.denis.course.Hibernate;

import com.denis.course.Hibernate.Entity.*;
import org.hibernate.*;
import org.hibernate.cfg.*;

import java.util.*;

public class Delete {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Workers.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            Workers emp = session.get(Workers.class, 2); // Delete employer with id = 2
            session.delete(emp);

            session.createQuery("delete Workers " + "where name = 'Alex'"); // Delete employer with name Alex

            List emps = session.createQuery("from Workers").getResultList();
            session.getTransaction().commit();
            for (Object e : emps) {
                System.out.println(e);
            }
        } finally {
            factory.close();
        }
    }
}
