package com.denis.course.Config;

import org.springframework.context.support.*;

public class Main4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
        Cat myDog = context.getBean("myPet", Cat.class);
    }
}
