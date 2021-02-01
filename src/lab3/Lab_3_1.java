package lab3;

import java.util.Scanner;

public class Lab_3_1 {

    public static void main(String[] args) {

        System.out.println("======================");
        System.out.println("학번: 2016000000");
        System.out.println("이름: 컴돌이의블로그");
        System.out.println("======================\n");

        Circle circle = new Circle(3.1);
        Scanner scan = new Scanner(System.in);

        System.out.println("반지름을 입력하세요:");
        Circle.radius = scan.nextInt();

        System.out.println("반지름 : "+ Circle.radius);
        System.out.printf("넓이 : "+ circle.getArea());

    }
}
//Made by 컴돌이//

