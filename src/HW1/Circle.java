package HW1;

public class Circle {
    static double radius;

    final double PI = 3.14159; // 원주율 변수 생성.

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius(double radius) {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double Area() {

        return PI * radius * radius; // 원의 넓이 구하는 공식
    }

    public double Perimeter() {
        return 2 * PI * radius; // 원의 들레 구하는 공식
    }
}
