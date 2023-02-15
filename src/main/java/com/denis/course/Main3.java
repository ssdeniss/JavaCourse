package com.denis.course;

import org.springframework.context.support.*;

public class Main3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");


        Person person1 = context.getBean("person", Person.class);
        Person person2 = context.getBean("person", Person.class);
        person1.callPet();
        person2.callPet();
        context.close();
    }
}
