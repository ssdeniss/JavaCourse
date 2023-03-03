package com.denis.course.AOP.AfterReturn;

import org.springframework.stereotype.*;

import java.util.*;

@Component
public class University {
    private final List<Student> students = new ArrayList<>();

    public void addStudent() {
        Student st1 = new Student("Alex Lehovschi", "2", 8.9);
        Student st2 = new Student("Andrew Smith", "1", 7.6);
        Student st3 = new Student("Vladimir Mitcev", "4", 9.5);

        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudent() {
        System.out.println("Info from getStudent method: ");
        System.out.println(students);
        System.out.println(students.get(3));
        return students;
    }
}
