package com.kodilla.stream.exception.Homework;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {

    List <Order> orderList = new ArrayList<>();

    public List <Order> addOrder(Order order) {
        orderList.add(order);
        return orderList;
    }
    public void getOrder(String number) {
        orderList.stream()
           .filter(n -> n.getNumber().equals(number))
           .forEach(System.out::println);
   }
}
