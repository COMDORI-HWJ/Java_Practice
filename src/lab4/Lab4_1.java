package lab4;

import java.util.Scanner;

public class Lab4_1 {

    void info(Robot r) { // 가격과 기능을 출력하는 메소드
        System.out.println("가격은 " + r.price + "만원 입니다.");
        System.out.println("기능은 " + r.toString());
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Lab4_1 lab = new Lab4_1(); // 랩4의 클래스 를 이어주는 구문.

        DanceRobot DA; // 춤추는 로봇
        DA = new DanceRobot(500); // 춤추는 로봇 가격 정의

        DrawRobot DR; // 그림그리는 로봇
        DR = new DrawRobot(300); // 그림 그리는 로봇 가격 정의

        SingRobot SR; // 노래 부르는 로봇
        SR = new SingRobot(600); // 노래 부르는 로봇 가격 정의

        System.out.println("======================");
        System.out.println("학번: 20160000");
        System.out.println("이름: 컴돌이");
        System.out.println("======================\n");

        String Menu;
        do {
            System.out.println("\t 어떤 로봇을 구매하시겠습니까? (0은 끝내기)");
            System.out.println("|1. 춤추는 로봇| |2. 노래하는 로봇| |3. 그림그리는 로봇|");
            Menu = scan.next(); // 메뉴를 입력받음

            if ("0".equals(Menu)) { // 0번을 입력받았을 경우 프로그램이 종료됨.
                System.out.println("프로그램을 끝내겠습니다.");
                System.exit(0);
            }

            else if ("1".equals(Menu)) { // 1번 메뉴를 선택시 춤추는 로봇의 정보를 나타냄.
                lab.info(DA);

            } else if ("2".equals(Menu)) { // 2번 메뉴를 선택시 노래 부르는 로봇의 정보를 나타냄.
                lab.info(DR);

            } else if ("3".equals(Menu)) { // 3번 메뉴를 선택시 그림그리는 로봇의 정보를 나타냄.
                lab.info(SR);
            } else {
                System.out.println("잘못입력하셨습니다. \n다시 입력하세요.");
            }

        } while (true);
    }
}
//Made by 컴돌이//