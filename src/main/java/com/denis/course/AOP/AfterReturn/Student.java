package com.denis.course.AOP.AfterReturn;

import lombok.*;

@Getter
@Setter
public class Student {
    private String nameSurname;
    private String course;
    private Double avgGrade;


    public Student(String nameSurname, String course, double avgGrade) {
        this.nameSurname = nameSurname;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameSurname='" + nameSurname + '\'' +
                ", course='" + course + '\'' +
                ", avgGrade=" + avgGrade +
                '}';

    }
}
