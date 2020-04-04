package rectangle;

import resizeable.Resizeable;

public class Rectangle implements Resizeable {
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    @Override
    public void resize(double percent) {
        System.out.println("The area of Rectangle before resize is " + this.getArea());
        System.out.println("The area of Rectangle after resize is " + this.getArea() * percent / 100);
    }
}
