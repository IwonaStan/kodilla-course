package com.kodilla.collections.adv.immutable.special.Homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {

    public static Book createBook (String title, String author) {
        List <Book> bookList = new ArrayList<>();

        // to można było jeszcze skrócić bookList.add(new Book(title, author);
        Book book = new Book(title, author);
        bookList.add(book);

        System.out.println(bookList);

        return new Book(title, author);
        }
}


