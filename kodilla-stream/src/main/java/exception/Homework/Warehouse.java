package exception.Homework;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {

    List <Order> orderList = new ArrayList<>();

    public List <Order> addOrder(Order order) {
        orderList.add(order);
        return orderList;
    }
    public Order getOrder(String number) throws OrderDoesntExistException {
        Order order = orderList.stream()
           .filter(n -> n.getNumber().equals(number))
           .findFirst()
           .orElseThrow(OrderDoesntExistException::new);
        System.out.println(order);
        return order;
   }
}
