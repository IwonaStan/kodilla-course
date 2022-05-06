package com.kodilla.collections.adv.immutable.special.Homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {

    static List <Book> bookList = new ArrayList<>();

    public static Book createBook(String title, String author) {
        // to można było jeszcze skrócić bookList.add(new Book(title, author);
        Book book = new Book(title, author);
        bookList.add(book);

        int i = bookList.size();

        while (i>1) {
            if (bookList.get(i-2).equals(book)) {
            System.out.println("Pozycja "+book+" jest już w spisie.");
            System.out.println(bookList.get(i-2).hashCode()==book.hashCode());
            }
            i--;
        }
        return new Book(title, author);
    }
}


