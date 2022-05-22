package execution_model.Homework;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    List<Order> shop = new ArrayList<>();
    int min, max = 0;

    public void addOrder (Order order) {
        shop.add(order);
    }
    public int orderGetSize() {
        return this.shop.size();
    }
    public List<Order> getOrders (int first, int last) {
        List<Order> orders = new ArrayList<>();
        for (Order order:shop) {
            if (order.getDate()>first && order.getDate()<last)
                orders.add(order);
        }
        return orders;
    }
    public List<Order> getOrdersByValue (int min, int max) {
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
