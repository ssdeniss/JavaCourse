package com.denis.course.AOP;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;


@Component
public class Book {
    @Value("Name of book")
    private String name;

    public String getName() {
        return name;
    }
}
