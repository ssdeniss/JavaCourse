package com.denis.course.Config;

import org.springframework.context.support.*;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");
        Dog myDog = context.getBean("dog", Dog.class);
        Dog yourDog = context.getBean("dog", Dog.class);

        System.out.println(myDog == yourDog);
        System.out.println(myDog);
        System.out.println(yourDog);

        context.close();
    }


}
