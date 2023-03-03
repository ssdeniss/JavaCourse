package com.denis.course.AOP;

import lombok.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.*;


@Component
@Getter
public class Book {
    @Value("Name of book")
    private String name;
    @Value("Author of book")
    private String author;
    @Value("1866")
    private int yearOfPublishing;
}
