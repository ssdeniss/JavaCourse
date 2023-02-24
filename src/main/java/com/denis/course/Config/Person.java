package com.denis.course.Config;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.*;

@Component("personBean")
@Setter
@Getter
@NoArgsConstructor
public class Person {

    private Pet pet;
    @Value("${person.surname}")
    private String name;
    @Value("${person.age}")
    private int age;


    public Person(Pet pet, String name) {
        this.pet = pet;
        this.name = name;
    }


    public Person(Pet pet) {
//        System.out.println("Person bean is created");
        this.pet = pet;
    }

    public void callPet() {
        if (this.name != null) {
            System.out.println("I am " + this.name);
        }
        System.out.println("Hello my pet");
        pet.speak();
    }
}
