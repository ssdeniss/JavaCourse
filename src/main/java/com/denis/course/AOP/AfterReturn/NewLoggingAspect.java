package com.denis.course.AOP.AfterReturn;

import org.aspectj.lang.*;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.*;

@Component
@Aspect
public class NewLoggingAspect {
    @Around("execution(public String returnBook())")
    public String aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice: trying to return a book in library");
        Object targetMethodResult = proceedingJoinPoint.proceed();
        System.out.println("aroundReturnBookLoggingAdvice: successful return book in library");
        return (String) targetMethodResult;
    }
}
