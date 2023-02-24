package com.denis.course.Config;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.*;

@Component
@Scope("singleton")
public class Dog implements Pet {
    @Override
    public void speak() {
        System.out.println("Bark");
    }
}
