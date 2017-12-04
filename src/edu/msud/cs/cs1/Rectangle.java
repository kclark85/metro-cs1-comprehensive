package edu.msud.cs.cs1;

public class Rectangle extends Parallelogram {
    Rectangle(double x, double y, double a, double b) {
        super(x, y, Math.PI/2, a, b);
    }

    @Override
    public String toString() {return String.format("Rectangle: x=%f y=%f theta=%f a=%f", x, y, theta, a);}
}
