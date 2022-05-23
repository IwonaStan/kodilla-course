package execution_model.Homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Shop {

    List<Order> shop = new ArrayList<>();

    public void addOrder (Order order) {
        shop.add(order);
    }
    public int orderGetSize() {
        return this.shop.size();
    }
    public List<Order> getOrders (LocalDate localDate1, LocalDate localDate2) {
        List<Order> orders = new ArrayList<>();
        for (Order order:shop) {
            if (localDate1.isBefore(order.getLocalDate()) && localDate2.isAfter(order.getLocalDate()))
                orders.add(order);
        }
        return orders;
    }
    public List<Order> getOrdersByValue (double min, double max) {
        List<Order> values = new ArrayList<>();
        for (Order order:shop) {
            if (order.getOrderValue()>min && order.getOrderValue()<max)
                values.add(order);
        }
        return values;
    }
    public double addOrders () {
        double sum =0;
        for (Order order:shop) {
            sum += order.getOrderValue();
        }
        return sum;
    }
}
