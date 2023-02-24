package com.denis.course.AOP.Aspects;

import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.*;
import org.springframework.stereotype.*;

@Component
@Aspect
@Order(1)
public class LoggingAspect {
    @Before("com.denis.course.AOP.Aspects.MyPointcuts.allGetMethods()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: try to get book or magazine");
    }
}
