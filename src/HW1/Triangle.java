package HW1;

public class Triangle {
    static double a, b, c, s;

    public Triangle(double a, double b, double c) {
        Triangle.a = a;
        Triangle.b = b;
        Triangle.c = c;
    }

    public double Area() {
        s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); // Math함수를 사용하여 삼각형의 넓이 구하는 공식

    }

    public double Perimeter() {
        return a + b + c; // 삼각형의 둘레 구하는 공식.
    }
}
