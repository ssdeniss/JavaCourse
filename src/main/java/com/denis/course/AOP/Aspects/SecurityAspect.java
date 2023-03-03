package com.denis.course.AOP.Aspects;

import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.*;
import org.springframework.stereotype.*;

@Component
@Aspect
@Order(2)
public class SecurityAspect {
    @Before("com.denis.course.AOP.Aspects.MyPointcuts.allAddMethods()")
    public void beforeAddSecurityAdvice() {
        System.out.println("beforeAddSecurityAdvice: checking the rights for receiving book or magazine");
        System.out.println("--------------------------------");
    }
}
