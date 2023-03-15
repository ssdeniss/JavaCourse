package com.denis.course.Hibernate;

import com.denis.course.Hibernate.Entity.*;
import org.hibernate.*;
import org.hibernate.cfg.*;

import java.util.*;

public class Delete {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            Employee emp = session.get(Employee.class, 2); // Delete employer with id = 2
            session.delete(emp);

            session.createQuery("delete Employee " + "where name = 'Alex'"); // Delete employer with name Alex

            List emps = session.createQuery("from Employee").getResultList();
            session.getTransaction().commit();
            for (Object e : emps) {
                System.out.println(e);
            }
        } finally {
            factory.close();
        }
    }
}
