package oop.interfaces;

public class Rectangle implements Shape {

    private double lenght;
    private double width;

    public Rectangle(double lenght, double width) {
        this.lenght = lenght;
        this.width = width;
    }

    @Override
    public double getArea() {
        return width * lenght;
    }

    @Override
    public double getPerimeter() {
        return 2 * lenght + 2 * width;
    }

    @Override
    public void print() {

    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "lenght = " + lenght +
                ", width = " + width +
                '}';
    }


}