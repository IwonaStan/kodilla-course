package com.kodilla.collections.Lists;

import com.kodilla.collections.Interfaces.Circle;
import com.kodilla.collections.Interfaces.Shape;
import com.kodilla.collections.Interfaces.Square;
import com.kodilla.collections.Interfaces.Triangle;
import java.util.LinkedList;
import java.util.List;

public class GeneralShapesListApplication {
    public static void main(String[] args) {

        List<Shape> shapes = new LinkedList<>();
// zapamiętanie obiektu square w zmiennej
        Square square = new Square(10.0);
        shapes.add(square);
        shapes.add(new Circle(7.0));
        shapes.add(new Triangle(10.0, 4.0, 10.77));

// usuwanie elementu o indeksie 1, czyli koła z kolekcji:
        shapes.remove(1);
// usuwanie obiektu z kolekcji:
        shapes.remove(square);
// kolejna metoda usuwająca, usuwa obiekt o podanych parametrach
        Triangle triangle = new Triangle(10.0, 4.0, 10.77);   // [2]
        shapes.remove(triangle);
// powyższy zapis można skrócić do: shapes.remove(new Triangle(10.0, 4.0, 10.77));

        System.out.println(shapes.size());
        for (Shape shape : shapes) {
            System.out.println(shape + ", area: " + shape.getArea() +
                    ", perimeter: " + shape.getPerimeter());
        }
    }
}
