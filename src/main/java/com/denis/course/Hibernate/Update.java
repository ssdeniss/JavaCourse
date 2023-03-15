package com.denis.course.Hibernate;

import com.denis.course.Hibernate.Entity.*;
import org.hibernate.*;
import org.hibernate.cfg.*;

import java.util.*;

public class Update {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            Employee emp = session.get(Employee.class, 1);
            emp.setSalary(1000);
            System.out.println(emp);

            session.createQuery("update Employee set salary = 800 " + "where name = 'Alex'").executeUpdate(); // Update salary
            List emps = session.createQuery("from Employee " + "where name = 'Alex'").getResultList(); // Get by name
            System.out.println(emps);
            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }
}
