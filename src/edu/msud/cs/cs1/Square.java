package edu.msud.cs.cs1;

public class Square extends Rectangle {

    Square(double x, double y, double a)
    {
        super(x,y,a,a);
        this.theta = Math.PI/2;
    }

    @Override
    public String toString(){
        return String.format("Square: x=%f y=%f a=%f theta=%f", x,y,a,theta);
    }

    public static void main(String[] args) {

    }
}
