package oop.inherintence;

public class Square extends GeometricFigure  {  //alt+enter+implement methods
    private int side;

    public Square(int side) {  //clic dreapta+generate +constructor
        this.side = side;  //folosim this.ca sa il vada pe cel din clasa nu pe cel din metoda ca si parametru
    }

    @Override
    public double calculatePerimeter() {
        return side * 4;
    }
}
