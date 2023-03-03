package com.denis.course.AOP.AfterReturn;

import com.denis.course.AOP.*;
import org.springframework.context.annotation.*;

import java.util.*;

public class AroundMain {
    public static void main(String[] args) {
        System.out.println("Main around start");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfigAOP.class);

        UniLibrary library = context.getBean("uniLibrary", UniLibrary.class);
        String bookName = library.returnBook();
        System.out.println("In library was returned " + bookName);
        context.close();
        System.out.println("Main around end");
    }
}
