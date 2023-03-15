package com.denis.course.Hibernate.Connections.OneToOne;


import com.denis.course.Hibernate.Connections.OneToOne.Entity.*;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class OneToOneUni {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();
        try {
            session.beginTransaction();
//                    Employee employee = new Employee("Oleg", "Porister", "HR", 1200);
//                    Detail detail = new Detail("Cricova", "546744", "Oleg.Porister@com");

//                    employee.setEmpDetail(detail);
//
//                    session.save(employee);
            Employee emp = session.get(Employee.class, 1);
//            session.delete(emp); // Delete object and details
            System.out.println(emp.getEmpDetail());


            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }
}
