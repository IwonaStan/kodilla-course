package com.kodilla.collections.Lists;

import com.kodilla.collections.Interfaces.Square;
import java.util.ArrayList;
import java.util.List;

public class ShapesListApplication {
    public static void main(String[] args) {

        List <Square> shapes = new ArrayList<>();
    /*  Square sq1 = new Square(10.0);
        shapes.add(sq1);
        te dwie linie w skrócie to :*/
        shapes.add(new Square(10.0));
    // i dalej kolejne elementy
        shapes.add(new Square(5.0));
        shapes.add(new Square(1.0));

    /*  for (int n = 0; n < shapes.size(); n++) {
            Square square = shapes.get(n);
        powyższy zapis można zapisać w następujący sposób  */
        for (Square square : shapes) {
            if (square.getArea() > 20)
                System.out.println(square + ", area: " + square.getArea());
        }

    }
}
