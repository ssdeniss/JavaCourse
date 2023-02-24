package com.denis.course.AOP.Aspects;

import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.*;
import org.springframework.stereotype.*;

@Component
@Aspect
@Order(3)
public class ExceptionHandlingAspect {
    @Before("com.denis.course.AOP.Aspects.MyPointcuts.allGetMethods()")
    public void beforeGetExceptionHandlingAdvice() {
        System.out.println("beforeGetExceptionHandlingAdvice: catching and processing exceptions when trying to get a book");
    }
}
