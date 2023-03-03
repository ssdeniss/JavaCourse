package com.denis.course.AOP.AfterReturn;

import com.denis.course.AOP.*;
import org.springframework.context.annotation.*;

import java.util.*;

public class UniversityMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfigAOP.class);

        University university = context.getBean("university", University.class);

        university.addStudent();
        try {
            List<Student> students = university.getStudent();
            System.out.println(students);
        } catch (Exception e) {
            System.out.println("Exception" + e.getMessage());
        }


        context.close();
    }
}
