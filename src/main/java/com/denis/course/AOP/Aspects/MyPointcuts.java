package com.denis.course.AOP.Aspects;

import org.aspectj.lang.annotation.*;

public class MyPointcuts {
    @Pointcut("execution(* get*())")
    public void allGetMethods() {
    }
}
