package exception.Homework;

import java.util.Scanner;

public class WarehouseApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("122"));
        warehouse.addOrder(new Order("133"));
        warehouse.addOrder(new Order("144"));
        warehouse.addOrder(new Order("122"));

            System.out.println("Enter order number:");
            String s = scanner.nextLine();
        try {
            warehouse.getOrder(s);
        } catch (OrderDoesntExistException e) {
            System.out.println("Wrong order number :(");
        }
    }
}
