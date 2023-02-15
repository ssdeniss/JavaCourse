package com.denis.course;

public class Person {
    private Pet pet;
    private String name;

    public Person(Pet pet, String name) {
        this.pet = pet;
        this.name = name;
    }

    public Person(Pet pet) {
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
