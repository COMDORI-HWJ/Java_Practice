package lab1;

import java.util.Scanner;

public class lab1_2 {

    public static void main(String[] args) {
        int sel = 0, Num1=0, Num2=0, result = 0; //선택, 첫번 째숫자,두번 째 숫자, 결과값

        Scanner scan = new Scanner(System.in);

        System.out.println("======================");
        System.out.println("학번: 20160000");
        System.out.println("이름: 컴돌이");
        System.out.println("======================");

        System.out.println("계산기 프로그램입니다. \n다음 숫자중 선택하세요.");
        System.out.println("1. 더하기 2. 빼기 3.곱하기 4. 나누기"); //선택 메뉴
        sel = scan.nextInt();

        switch(sel){
            case 1:
                System.out.println("첫번 째 숫자: ");
                Num1 = scan.nextInt();
                System.out.println("두번 째 숫자: ");
                Num2 = scan.nextInt();
                result=Num1+Num2; //더하기
                System.out.println(result);
                break;
            case 2:
                System.out.println("첫번 째 숫자: ");
                Num1 = scan.nextInt();
                System.out.println("두번 째 숫자: ");
                Num2 = scan.nextInt();
                result=Num1-Num2; //빼기
                System.out.println(result);
                break;
            case 3:
                System.out.println("첫번 째 숫자: ");
                Num1 = scan.nextInt();
                System.out.println("두번 째 숫자: ");
                Num2 = scan.nextInt();
                result=Num1*Num2; //곱하기
                System.out.println(result);
                break;
            case 4:
                System.out.println("첫번 째 숫자: ");
                Num1 = scan.nextInt();
                System.out.println("두번 째 숫자: ");
                Num2 = scan.nextInt();
                result=Num1/Num2; //나누기
                System.out.println(result);
                break;
            default: System.out.println("잘못입력하셨습니다"); //잘못입력값
        }
    }
}