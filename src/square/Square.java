package square;

import resizeable.Resizeable;

public class Square implements Resizeable {
    private double size;

    public Square() {
    }

    public Square(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getArea() {
        return this.size * this.size;
    }

    @Override
    public void resize(double percent) {
        System.out.println("The area of Square before resize is " + this.getArea());
        System.out.println("The area of Square after resize is " + this.getArea() * percent /100);
    }
}

