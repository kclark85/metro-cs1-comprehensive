package edu.msud.cs.cs1;

public class Rhombus extends Parallelogram{

    Rhombus(double x, double y, double a, double theta)
    {
        super(x,y,theta,a,a);
    }

    public String toString(){
        return String.format("Rhombus: x=%f y=%f a=%f theta=%f", x, y, a, theta);
    }
}
