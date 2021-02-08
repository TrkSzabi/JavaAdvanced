package oop.inherintence;

public class Circle extends GeometricFigure {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
