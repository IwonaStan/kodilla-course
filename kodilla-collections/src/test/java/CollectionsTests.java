import collections.Interfaces.Circle;
import collections.Interfaces.Homework.Fiat;
import collections.Interfaces.Homework.Polonez;
import collections.Interfaces.Homework.Trabant;
import collections.Interfaces.Square;
import collections.Interfaces.Triangle;
import collections.Sets.Homework.Stamp;
import collections.Sets.Order;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CollectionsTests {
    @Test
    void setsTest () {
        Stamp stamp = new Stamp("First",1.5, 2.5, true);

        assertEquals("First", stamp.getStampName());
        assertEquals(1.5, stamp.getStampWidth());
        assertEquals(2.5, stamp.getStampHeight());
        assertEquals(true, stamp.isStamped());

        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("First_stamp",1.5, 2.5, true));
        stamps.add(new Stamp("Second_stamp",1.3, 2.7, false));
        stamps.add(new Stamp("Third_stamp",1.7, 2.3, true));
        stamps.add(new Stamp("Fourth_stamp",2.0, 2.5, false));
        stamps.add(new Stamp("First_stamp",1.5, 2.5, true));
        stamps.add(new Stamp("Sixth_stamp",2.3, 2.8, false));

        assertEquals(5, stamps.size());
    }
    @Test
    void setsHomeworkTest () {
        Order order = new Order("1/2019", "Iron", 1.0);

        assertEquals("1/2019", order.getOrderName());
        assertEquals("Iron", order.getProductName());
        assertEquals(1.0, order.getQuantity());

        Set<Order> orders = new HashSet<>();
        orders.add(new Order("1/2019", "Iron", 1.0));
        orders.add(new Order("2/2019", "Cutlery", 6.0));
        orders.add(new Order("3/2019", "Chair", 2.0));
        orders.add(new Order("1/2019", "Iron", 1.0));

        assertEquals(3, orders.size());
    }
    @Test
    void interfacesTest() {
        Circle circle = new Circle(1);
        assertEquals(3.141, circle.getArea(),3);
        assertEquals(6.283, circle.getPerimeter(),3);

        Square square = new Square(1);
        assertEquals(1, square.getArea(),3);
        assertEquals(4, square.getPerimeter(),3);

        Triangle triangle = new Triangle(1,2,3);
        assertEquals(1, triangle.getArea(),3);
        assertEquals(6, triangle.getPerimeter(),3);
    }
    @Test
    void interfacesHomeworkTest() {
        Fiat fiat = new Fiat(10,20);
        assertEquals(10,fiat.getSpeedPlus());
        assertEquals(20,fiat.getSpeedMinus());

        Polonez polonez = new Polonez(20,30);
        assertEquals(20, polonez.getSpeedPlus());
        assertEquals(30, polonez.getSpeedMinus());

        Trabant trabant = new Trabant(30,40);
        assertEquals(30, trabant.getSpeedPlus());
        assertEquals(40,trabant.getSpeedMinus());
    }
}
