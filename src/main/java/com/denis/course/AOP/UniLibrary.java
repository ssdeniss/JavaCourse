package com.denis.course.AOP;

import org.springframework.stereotype.*;

@Component
public class UniLibrary extends AbstractLibrary {

    //    public void getBook(Book book) {
//        System.out.println("I take a book from university library " + book.getName());
//    }
    public void getBook() {
        System.out.println("I take a book from university library");
        System.out.println("--------------------------------");
    }

    public void getMagazine() {
        System.out.println("I take a magazine from university library");
        System.out.println("--------------------------------");
    }

    public String returnBook() {
        System.out.println("I return a book to university library");
        return "Voina i Mir";
    }

    public void returnMagazine() {
        System.out.println("I return a magazine to university library");
        System.out.println("--------------------------------");
    }

    public void addBook(String person_name, Book book) {
        System.out.println("I add a book to university library");
        System.out.println("--------------------------------");
    }

    public void addMagazine() {
        System.out.println("I add a magazine to university library");
        System.out.println("--------------------------------");
    }
}
