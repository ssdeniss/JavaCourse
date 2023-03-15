package com.denis.course.Hibernate;

import com.denis.course.Hibernate.Entity.*;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class GetEmployer {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Workers.class)
                .buildSessionFactory();
// Without session, you can't do some operations with java objects
        try {
            Session session = factory.getCurrentSession();
            Workers emp = new Workers("Oleg", "Smirnov", "IT", 500);
            session.beginTransaction();
            session.save(emp);

            int myId = emp.getId();
            Workers employee = session.get(Workers.class, myId);
            session.getTransaction().commit();
            System.out.println(employee);

        } finally {
            factory.close();
        }
    }
}
