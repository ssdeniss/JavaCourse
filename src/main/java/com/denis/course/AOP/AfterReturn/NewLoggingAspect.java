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
        long begin = System.currentTimeMillis();
        Object targetMethodResult = proceedingJoinPoint.proceed();
        long end = System.currentTimeMillis();
        System.out.println("aroundReturnBookLoggingAdvice: successful return book in library");
        System.out.println("method return book in: " + (end - begin));
        System.out.println(end);
        return (String) targetMethodResult;
    }
}
