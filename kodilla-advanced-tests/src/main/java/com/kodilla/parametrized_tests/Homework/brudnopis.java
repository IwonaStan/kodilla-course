package com.kodilla.parametrized_tests.Homework;

import execution_model.Homework.Order;
import execution_model.Homework.Shop;

public class brudnopis {
    public static void main(String[] args) {

        Shop shop = new Shop();
        Order order1 = new Order(22.22,2002,"zzz");
        Order order2 = new Order(33.33,2006,"xxx");
        Order order3 = new Order(44.44,2012,"ccc");
        Order order4 = new Order(55.55,2018,"vvv");
        Order order5 = new Order(66.66,2022,"bbb");
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        shop.addOrder(order4);
        shop.addOrder(order5);

        System.out.println(shop.getOrders(100,2020));

    }
}
