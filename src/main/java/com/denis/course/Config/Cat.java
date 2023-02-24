package com.denis.course.Config;

import org.springframework.stereotype.*;

@Component("catBeanId")
public class Cat implements Pet {
    @Override
    public void speak() {
        System.out.println("Meow");
    }

    public Cat() {
//        System.out.println("Cat bean is created");
    }
}
