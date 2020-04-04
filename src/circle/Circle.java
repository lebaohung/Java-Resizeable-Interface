package circle;

import resizeable.Resizeable;

public class Circle implements Resizeable {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void resize(double percent) {
        System.out.println("The area of Circle before resize is " + this.getArea());
        System.out.println("The area of Circle after resize is " + this.getArea() * percent / 100);
    }
}
