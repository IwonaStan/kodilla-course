package com.kodilla.collections.adv.immutable.special.Homework;

public class Book {

    private static String title;
    private static String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

   @Override
   public String toString() {
       return "Book title:" + title + " Author:" + author + '\n';
   }
}
