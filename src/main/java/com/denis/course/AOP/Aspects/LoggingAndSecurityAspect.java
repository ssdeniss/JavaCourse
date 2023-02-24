package com.denis.course.AOP.Aspects;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.*;

@Component
@Aspect
public class LoggingAndSecurityAspect {
//?    @Before("execution( * getLibrary(String))")
//    public void beforeGetBookAdvice() {
//        System.out.println("beforeGetBookAdvice: try to get book");
//    }
//
// ?   @Before("execution( * *(..))")
//    public void beforeGetBookAdvice() {
//        System.out.println("beforeGetBookAdvice: try to get book");
//    }
//?    @Before("execution( public String getBook(com.denis.course.AOP.Book))")
//    public void beforeGetBookAdvice() {
//        System.out.println("beforeGetBookAdvice: try to get book");
//    }
//?    @Before("execution( public void getBook(com.denis.course.AOP.Book, ..))")
//    public void beforeGetBookAdvice() {
//        System.out.println("beforeGetBookAdvice: try to get book");
//    }

//?    @Pointcut("execution( * get*())")
//    private void allGetMethods() {
//    }
//
//    @Before("allGetMethods()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: try to get book or magazine");
//    }
//
// ?   @Before("allGetMethods()")
//    public void beforeGetSecurityAdvice() {
//        System.out.println("beforeGetSecurityAdvice: checking the rights for receiving book or magazine");
//    }
//
//
//?    @Before("execution( * returnBook())")
//    public void beforeReturnBookAdvice() {
//        System.out.println("beforeReturnBookAdvice: try to return book");
//    }

//    @Pointcut("execution( * com.denis.course.AOP.UniLibrary.get*())")
//    private void allGetMethodsFromUniLibrary() {
//    }
//
//    @Pointcut("execution( * com.denis.course.AOP.UniLibrary.return*())")
//    private void allReturnMethodsFromUniLibrary() {
//    }
//
//    //? Combination of pointcut methods
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//    private void allGetAndReturnMethodsFromUniLibrary() {
//    }
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: writing Log #1");
//    }
//
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
//    }
//
//    @Before("allGetAndReturnMethodsFromUniLibrary()")
//    public void beforeGetAndReturnLoggingAdvice() {
//        System.out.println("beforeGetAndReturnLoggingAdvice: writing Log #3");
//    }

//
//    @Pointcut("execution(* com.denis.course.AOP.UniLibrary.*(..))")
//    private void allMethodsFromUniLibrary() {
//    }
//
//    @Pointcut("execution(public void com.denis.course.AOP.UniLibrary.returnMagazine())")
//    private void returnMagazineFromUniLibrary() {
//
//    }
//
//    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
//    private void allMethodsExceptReturnMagazineFromUniLibrary() {
//
//    }
//
//    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
//    public void beforeAllMethodsExceptReturnMagazineAdvice() {
//        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: Log #4");
//    }
}
