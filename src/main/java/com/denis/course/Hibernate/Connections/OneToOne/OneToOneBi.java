package com.denis.course.Hibernate.Connections.OneToOne;

import com.denis.course.Hibernate.Connections.OneToOne.Entity.*;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class OneToOneBi {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();
        try {
            Employee employee = new Employee("Nikolay", "Fitulin", "Manager", 1000);
            Detail detail = new Detail("Moscow", "232323", "Nikolay.Fitulin@com");

            employee.setEmpDetail(detail);
            detail.setEmployee(employee);
            session.beginTransaction();
            session.save(detail);

            Employee employeeDetail = session.get(Employee.class, 1); // Get employer
            Detail detailEmployer = session.get(Detail.class, 1); // Get details

            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }
}
