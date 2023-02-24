package com.denis.course.Config;

import org.springframework.context.support.*;

public class Main3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");


        Person person1 = context.getBean("person", Person.class);
        person1.callPet();
        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        context.close();
    }
}
