package com.denis.course.Config;

import org.springframework.context.support.*;

public class Main2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Pet pet = context.getBean("myPet", Pet.class);
        pet.speak();
        context.close();
    }
}
