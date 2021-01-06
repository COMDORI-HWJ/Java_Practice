package com.comdori;

import java.util.Scanner;

public class lab1_3 {

    public static void main(String[] args) {
        System.out.println("======================");
        System.out.println("학번: 2015060000");
        System.out.println("이름: 컴돌이");
        System.out.println("======================");

        Scanner scan = new Scanner(System.in);
        int Num1 = 0; //돈 입력
        int[] coin = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 }; //화폐 나눌거 배열
        int leftcoin = 9; //10원 이하 Won

        System.out.println("돈을 입력해주세요 (0~100,000)");
        Num1 = scan.nextInt();

        if(Num1 >100000 || Num1<0){
            System.out.println("0~100,000원 사이로 입력해주세여.초과값입니다.");
        }

        else{
            for (int i = 0; i < coin.length; i++) {
                if ((Num1 / coin[i]) > 0) { //입력한 숫자를 코인배열에서 나눕니다.
                    System.out.println(coin[i] + "원: " + Num1 / coin[i]);
                    Num1 %= coin[i];
                    if (leftcoin >= Num1) {  //남은돈 계산 식
                        leftcoin = Num1; //남은돈 계산식
                    }
                }
            }
            System.out.print("남은돈: ");
            System.out.println(leftcoin);
        }
    }
}