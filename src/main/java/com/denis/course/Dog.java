package com.denis.course;

public class Dog implements Pet {
    @Override
    public void speak() {
        System.out.println("Bark");
    }
}
