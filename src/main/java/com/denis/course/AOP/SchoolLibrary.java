package com.denis.course.AOP;

import org.springframework.stereotype.*;

@Component
public class SchoolLibrary extends AbstractLibrary {


    public String getBook() {
        System.out.println("I take a book from school library");
        return "Ok";
    }

}
