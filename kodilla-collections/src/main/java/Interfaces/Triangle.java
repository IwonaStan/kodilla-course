package Interfaces;

public class Triangle implements Shape {

    double width;
    double height;
    double hypotenuse;

    public Triangle(double width, double height, double hypotenuse) {
        this.width = width;
        this.height = height;
        this.hypotenuse = hypotenuse;
    }

    public double getArea() {
        return width*height/2;
    }

    public double getPerimeter() {
        return width+height+hypotenuse;
    }
}
