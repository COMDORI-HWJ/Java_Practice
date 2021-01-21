package lab2;

import java.util.Scanner;

public class Lab2_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("======================");
        System.out.println("학번: 00000000");
        System.out.println("이름: 컴돌이");
        System.out.println("======================\n");
        System.out.println("짝수, 홀수, 제로 개수 세기 프로그램 입니다.\n");


        while(true){ 				//전체 While
            String check = "Y";  //문제 조건.
            int sc_num=0, re_num=0; 			//입력받는
            int  evenCount=0, oddCount=0,  zeroCount=0;  //차례대로 짝수, 홀수, 제로 변수 선언.

            System.out.println("양의 정수를 입력해주세요.");  //입력받은 정수 출력문
            sc_num=scan.nextInt();
            while(sc_num!=0){  //2번째 중첩 while

                re_num=sc_num%10; //입력받은 정수를 10으로 나누어 나머지값을 re_num에 대입
                sc_num=sc_num/10; // 입력받은 정수를 10으로 나누어 몫값을 저장.

                if(re_num%2==0 && re_num!=0){ 						//짝수 구하는 공식.
                    evenCount++;				//카운터 1씩 증가.
                }
                else if(re_num%2==1) { 								 //홀수
                    oddCount++;			//카운터 1씩 증가.
                }
                //while end.
                if(re_num==0){				 //제로 구하는 공식.
                    zeroCount++;						//카운터 1씩 증가.
                }
            }
            System.out.println("zero 개수:  "+zeroCount);			//
            System.out.println("짝수 개수:  "+evenCount);			//
            System.out.println("홀수 개수:  "+oddCount);			//
            /////////////////////////////////////////////////////////////////////
            System.out.println("다른 수로 하시겠습니까? (Y/N)");
            check=scan.next();
            if((check.equalsIgnoreCase("Y"))){ 					//Y 값을 입력받으면 처음으로 돌아가 다시 반복.
                continue;
            }
            else if((check.equalsIgnoreCase("n"))){ 				//N값을 입력받으면 그상태에서 종료.
                System.exit(0);
            }
            else {
                System.out.println("잘못입력습니다. 다시 입력하세요.");
                continue;
            }
        } //전체 while End.
    }
}