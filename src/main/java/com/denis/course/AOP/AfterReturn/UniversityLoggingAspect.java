package com.denis.course.AOP.AfterReturn;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.*;

import java.math.*;
import java.text.*;
import java.util.*;

@Component
@Aspect
public class UniversityLoggingAspect {
    private static final DecimalFormat df = new DecimalFormat("0.0");

    @Before("execution(* getStudent())")
    public void beforeGetStudentLoggingAdvice() {
        System.out.println("beforeGetStudentLoggingAdvice: logging and get students list before method getStudent");
    }

    @AfterReturning(pointcut = "execution(* getStudent())", returning = "student")
    public void afterReturningStudentLoggingAdvice(List<Student> student) {

        Student firstStudent = student.get(0);

        String nameSurname = firstStudent.getNameSurname();
        nameSurname = "Mr. " + nameSurname;
        firstStudent.setNameSurname(nameSurname);

        BigDecimal avgGrade = BigDecimal.valueOf(firstStudent.getAvgGrade() + 0.3).setScale(2, RoundingMode.HALF_UP);
        firstStudent.setAvgGrade(avgGrade.doubleValue());

        System.out.println("afterReturningStudentLoggingAdvice: logging and get students list after method get student");
    }

    // Exceptions
//    @AfterThrowing("execution(* getStudent())")
//    public void afterThrowingStudentLoggingAdvice(){
//        System.out.println("afterThrowingStudentLoggingAdvice: logging exception");
//    }
//
    @AfterThrowing(pointcut = "execution(* getStudent())", throwing = "exception")
    public void afterThrowingStudentLoggingAdvice(Throwable exception) {
        System.out.println("afterThrowingStudentLoggingAdvice: logging exception" + exception);
    }

    @After("execution(* getStudent())")
    public void afterGetStudentLoggingAdvice() {
        System.out.println("afterGetStudentLoggingAdvice: logging ending of method work or exception");
    }

}
