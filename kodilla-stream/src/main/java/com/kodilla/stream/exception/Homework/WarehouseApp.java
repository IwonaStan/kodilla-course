package com.kodilla.stream.exception.Homework;

import java.util.Scanner;

public class WarehouseApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("122"));
        warehouse.addOrder(new Order("133"));
        warehouse.addOrder(new Order("144"));
        warehouse.addOrder(new Order("155"));

            System.out.println("Enter order number:");
            String s = scanner.nextLine();
            warehouse.getOrder(s);
    }
}
