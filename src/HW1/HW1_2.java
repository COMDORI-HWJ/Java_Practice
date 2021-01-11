package HW1;

import java.util.Scanner;

public class HW1_2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Circle circle = new Circle(3.1);		//원 클래스 불러오기
        Square square = new Square(3.1);		//정사각형 클래스 불러오기
        Triangle triangle = new Triangle(3.1, 3.1, 3.1);		//삼각형 클래스 불러오기
        Scanner scan = new Scanner(System.in);

        System.out.println("======================\n학번: 20160000\n이름: 컴돌이\n======================");

        System.out.println("원의 반지름을 입력하세요:");
        Circle.radius = scan.nextInt();			//원의 반지름 입력받기.
        System.out.println("정사각형의 길이를 입력하세요:");
        Square.side = scan.nextInt();			//정삼각형의 길이 입력받기.
        System.out.println("삼각형의 a점을 입력하세요:");
        Triangle.a = scan.nextInt();			//삼각형 a점 입력받기.
        System.out.println("삼각형의 b점을 입력하세요:");
        Triangle.b = scan.nextInt();			//삼각형 b점 입력받기.
        System.out.println("삼각형의 c점을 입력하세요:");
        Triangle.c = scan.nextInt();			//삼각형 c점 입력 받기.

        System.out.println("\t원\n넓이: " + circle.Area() + "\n둘레: " + circle.Perimeter());		//원의 넓이, 둘레 출력하기.
        System.out.println("\t정사각형\n넓이: " + square.Area() + "\n둘레: " + square.Perimeter());	//정사각형의 넓이, 둘레 출력하기.
        System.out.println("\t삼각형\n넓이: " + triangle.Area() + "\n둘레: " + triangle.Perimeter());//삼각형의 넓이, 둘레 출력하기.
    }

}
