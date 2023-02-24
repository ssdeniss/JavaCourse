package com.denis.course.Config;

import org.springframework.context.support.*;

public class ConfigWithAnnotation {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");


        Person person = context.getBean("personBean", Person.class);
        person.callPet();
//        Cat cat = context.getBean("catBeanId", Cat.class);
//        context.close();
    }
}
