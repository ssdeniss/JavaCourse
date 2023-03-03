package com.denis.course.AOP;

import org.springframework.context.annotation.*;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(MyConfigAOP.class);

        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);

        Book book = context.getBean("book", Book.class);

        uniLibrary.getBook();
//        uniLibrary.returnMagazine();
        uniLibrary.addBook("Name", book);
        uniLibrary.addMagazine();
//        schoolLibrary.getBook();
//        uniLibrary.returnBook();
        context.close();
    }
}
