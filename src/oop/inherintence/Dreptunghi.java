package oop.inherintence;

public class Dreptunghi extends GeometricFigure {
    private int latura1;
    private int latura2;

    public Dreptunghi(int latura1, int latura2) {
        this.latura1 = latura1;
        this.latura2 = latura2;
    }

    @Override
    public double calculatePerimeter() {
        return latura1 * 2 + latura2 * 2;
    }
}
