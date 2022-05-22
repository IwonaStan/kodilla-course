package execution_model.Homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShopTest {

    Shop shop = new Shop();
    Order order1 = new Order(22.22,2002,"zzz");
    Order order2 = new Order(33.33,2006,"xxx");
    Order order3 = new Order(44.44,2012,"ccc");
    Order order4 = new Order(55.55,2018,"vvv");
    Order order5 = new Order(66.66,2022,"bbb");

    @BeforeEach
    public void initializeInvoice() {
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        shop.addOrder(order4);
        shop.addOrder(order5);
    }

    @Test
    void addOrder() {
        Order order6 = new Order(77.77,2026,"nnn");
        shop.addOrder(order6);

        assertEquals(6,shop.orderGetSize());
    }
    @Test
    void getOrders() {
        List<Order> shopOrders = new ArrayList<>();
        shopOrders.add(order2);
        shopOrders.add(order3);
        shopOrders.add(order4);

        shopOrders.equals(shop.getOrders(2004,2020));
    }
    @Test
    void getOrdersByValue() {
        List<Order> shopOrders = new ArrayList<>();
        shopOrders.add(order1);
        shopOrders.add(order2);

        shopOrders.equals(shop.getOrdersByValue(10,40));
    }
    @Test
    void numbersOfOrders() {
        assertEquals(5, shop.orderGetSize());
    }
    @Test
    void addOrders() {
        assertEquals(222.20,shop.addOrders());
    }
}