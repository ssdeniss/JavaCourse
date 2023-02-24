package com.denis.course.Config.ConfigWithJava;

import com.denis.course.Config.*;
import org.springframework.context.annotation.*;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

//        Pet cat = context.getBean("catBean", Pet.class);
//        cat.speak();

        Person person = context.getBean("personBean", Person.class);
        System.out.println(person.getName());
        System.out.println(person.getAge());
        context.close();
    }
}
