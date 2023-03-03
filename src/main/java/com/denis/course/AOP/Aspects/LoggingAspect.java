package com.denis.course.AOP.Aspects;

import com.denis.course.AOP.*;
import org.aspectj.lang.*;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.*;
import org.springframework.core.annotation.*;
import org.springframework.stereotype.*;

@Component
@Aspect
@Order(1)
public class LoggingAspect {
    @Before("com.denis.course.AOP.Aspects.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature: " + methodSignature);
        System.out.println("methodSignature.getMethod(): " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType(): " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName(): " + methodSignature.getName());

        if (methodSignature.getName().equals("addBook")) {
            Object[] args = joinPoint.getArgs();
            for (Object obj : args) {
                if (obj instanceof Book) {
                    Book myBook = (Book) obj;
                    System.out.println("Info about book: " + myBook.getName() +
                            ", author: " + myBook.getAuthor() + ", year: " +
                            myBook.getYearOfPublishing());
                }
                else if (obj instanceof String){
                    System.out.println("Book in library has added by: " + obj);
                }
            }
        }

        System.out.println("beforeAddLoggingAdvice: try to get book or magazine");
        System.out.println("--------------------------------");
    }
}
