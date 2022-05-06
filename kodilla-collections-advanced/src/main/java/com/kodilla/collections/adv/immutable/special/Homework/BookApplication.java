package com.kodilla.collections.adv.immutable.special.Homework;

public class BookApplication {
    public static void main(String[] args) {

        Book book1 = BookManager.createBook("Lalka", "Bolesław Prus");
        Book book2 = BookManager.createBook("Antek", "Bolesław Prus");
        Book book3 = BookManager.createBook("Lalka", "Bolesław Prus");

        System.out.println(book1.hashCode()+" "+book2.hashCode()+" "+book3.hashCode());
        System.out.println(book1==book2);
        System.out.println(book2==book3);
        System.out.println(book3==book1);
    }
}
