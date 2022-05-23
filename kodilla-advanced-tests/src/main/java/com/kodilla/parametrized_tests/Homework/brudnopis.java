package com.kodilla.parametrized_tests.Homework;

import execution_model.Homework.Order;
import execution_model.Homework.Shop;

import java.time.LocalDate;

public class brudnopis {
    public static void main(String[] args) {

        Shop shop = new Shop();
        Order order1 = new Order(22.22, LocalDate.of(2002,4,10),"zzz");
        Order order2 = new Order(33.33, LocalDate.of(2006,6,11),"xxx");
        Order order3 = new Order(44.44, LocalDate.of(2012,8,12),"ccc");
        Order order4 = new Order(55.55, LocalDate.of(2018,10,13),"vvv");
        Order order5 = new Order(66.66, LocalDate.of(2022,12,14),"bbb");
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        shop.addOrder(order4);
        shop.addOrder(order5);

        System.out.println(shop.getOrders(LocalDate.of(2000,10,10),LocalDate.of(2002,01,01)));
        System.out.println(shop.getOrdersByValue(40.00,80.00));
    }
}
