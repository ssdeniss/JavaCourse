package com.denis.course.AOP;

import org.springframework.stereotype.*;

@Component
public class UniLibrary extends AbstractLibrary {

    //    public void getBook(Book book) {
//        System.out.println("I take a book from university library " + book.getName());
//    }
    public void getBook() {
        System.out.println("I take a book from university library");
    }

    public String getMagazine() {
        System.out.println("I take a magazine from university library");
        return "Ok";
    }

    public void returnBook() {
        System.out.println("I return a book to university library");
    }

    public void returnMagazine() {
        System.out.println("I return a magazine to university library");
    }

    public void addBook() {
        System.out.println("I add a book to university library");
    }

    public void addMagazine() {
        System.out.println("I add a magazine to university library");
    }
}
