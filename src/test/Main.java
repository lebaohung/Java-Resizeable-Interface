package test;

import circle.Circle;
import rectangle.Rectangle;
import square.Square;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.resize(Math.random() * 100);

        Rectangle rectangle = new Rectangle(6,4);
        rectangle.resize(Math.random() * 100 );

        Square square = new Square(9);
        square.resize(Math.random() * 100);
    }
}
