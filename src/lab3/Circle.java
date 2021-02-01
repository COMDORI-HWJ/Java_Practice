package lab3;

public class Circle{
    static double radius;
    final double PI = 3.14159;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(double radius){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){

        return PI*radius*radius;
    }
}
