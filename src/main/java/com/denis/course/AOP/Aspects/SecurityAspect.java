package com.denis.course.AOP.Aspects;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.*;

@Component
@Aspect
public class SecurityAspect {
    @Before("com.denis.course.AOP.Aspects.MyPointcuts.allGetMethods()")
    public void beforeGetSecurityAdvice() {
        System.out.println("beforeGetSecurityAdvice: checking the rights for receiving book or magazine");
    }
}
