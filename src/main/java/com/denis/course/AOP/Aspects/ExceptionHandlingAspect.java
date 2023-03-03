package com.denis.course.AOP.Aspects;

import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.*;
import org.springframework.stereotype.*;

@Component
@Aspect
@Order(3)
public class ExceptionHandlingAspect {
    @Before("com.denis.course.AOP.Aspects.MyPointcuts.allAddMethods()")
    public void beforeAddExceptionHandlingAdvice() {
        System.out.println("beforeAddExceptionHandlingAdvice: catching and processing exceptions when trying to get a book");
        System.out.println("--------------------------------");
    }
}
