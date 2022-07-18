package abstracts.homework;

public class Square extends Shape {

    @Override
     public void circuit(double sideA, double sideB) {
        System.out.println("Circuit of the square is: " +4*sideA);
    }
    @Override
    public void area(double sideA, double sideB) {
        System.out.println("Area of the square is: " +sideA*sideA);
    }

}
