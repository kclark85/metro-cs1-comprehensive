package edu.msud.cs.cs1;

public class Parallelogram extends Geometric {

    protected double theta, a, b;

    Parallelogram(double x, double y, double theta, double a, double b)
    {
        super(x,y);
        this.a = a;
        this.b = b;
        this.theta = theta;

    }

    @Override
    public double getArea(){return a * b * Math.sin(theta);}

    @Override
    public String toString(){
        return String.format("Parallelogram: x=%f y=%f theta=%f a=%f b=%f", x, y, theta, a, b);
    }

}
