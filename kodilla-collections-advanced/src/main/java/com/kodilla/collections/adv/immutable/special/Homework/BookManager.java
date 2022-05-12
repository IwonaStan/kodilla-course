
package com.kodilla.collections.adv.immutable.special.Homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {

    static List <Book> bookList = new ArrayList<>();

    public static Book createBook(String title, String author) {
        // to można było jeszcze skrócić bookList.add(new Book(title, author);
        Book book = new Book(title, author);

        for (Book book1:bookList) {
            if (book1.equals(book))
                return new Book(title, author);
        }
        bookList.add(book);
        return new Book(title, author);
    }

    public static void printList() {
        System.out.println(bookList);
    }
}
