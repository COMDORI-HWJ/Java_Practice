package HW1;

public class Square {
    static double side;

    public Square(double side) {
        Square.side = side;
    }

    public double Area() {
        return side * side; // 정사각형의 넓이 구하는 공식
    }

    public double Perimeter() {
        return (side + side) * 2; // 정사각형의 둘레 구하는 공식
    }
}
