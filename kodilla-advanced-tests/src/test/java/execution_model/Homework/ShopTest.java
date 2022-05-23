package execution_model.Homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShopTest {

    Shop shop = new Shop();
    Order order1 = new Order(22.22, LocalDate.of(2002,4,10),"zzz");
    Order order2 = new Order(33.33, LocalDate.of(2006,6,11),"xxx");
    Order order3 = new Order(44.44, LocalDate.of(2012,8,12),"ccc");
    Order order4 = new Order(55.55, LocalDate.of(2018,10,13),"vvv");
    Order order5 = new Order(66.66, LocalDate.of(2022,12,14),"bbb");
    List<Order> shopOrders = new ArrayList<>();

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
        Order order6 = new Order(77.77,LocalDate.of(2010,10,10),"nnn");
        shop.addOrder(order6);

        assertEquals(6,shop.orderGetSize());
    }
    @Test
    void getOrdersWithCorrectDates() {
        shopOrders.add(order2);
        shopOrders.add(order3);
        shopOrders.add(order4);

        shopOrders.equals(shop.getOrders(LocalDate.of(2004,10,10),LocalDate.of(2020,10,10)));
    }
    @Test
    void getOrdersWithWrongDates() {
        shopOrders.equals(shop.getOrders(LocalDate.of(2030,10,10),LocalDate.of(2020,10,10)));
    }
    @Test
    void getOrdersByValueWithCorrectValues() {
        shopOrders.add(order1);
        shopOrders.add(order2);

        shopOrders.equals(shop.getOrdersByValue(80,40));
    }
    @Test
    void getOrdersByValueWithWrongValues() {
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