package lab2;

import java.util.Scanner;

public class Lab2_1 {

    public static void main(String[] args){
        int  count;
        float sum;
        Scanner sc = new Scanner(System.in);

        System.out.println("======================");
        System.out.println("학번: 201500000");
        System.out.println("이름: 컴돌이");
        System.out.println("======================\n");

        System.out.println("총 몇명의 성적을 입력 받겠습니까? \n");
        count = sc.nextInt();
        Object[] [] sub = new Object [count] [4];

        for(int j=0; j<count; j++){
            System.out.println("이름 : ");
            sub [j] [0] = sc.next();	//이름 입력 받기
            System.out.println("국어: ");
            sub [j] [1] = sc.nextInt();
            System.out.println("영어: ");
            sub [j] [2] = sc.nextInt();
            System.out.println("수학: ");
            sub [j] [3] = sc.nextInt();
        }
        System.out.println("=================결과=================");
        System.out.println("\n-------------------------------------------------------------");
        System.out.println("이름\t\t국어\t 영어 수학\t 평균\t ");
        for(int j=0; j<count; j++){
            sum= (Integer)sub[j] [1] + (Integer)sub[j] [2] + (Integer)sub[j] [3];
            System.out.printf(sub[j] [0] + "\t\t" + sub[j] [1] + "\t " + sub[j] [2] + "\t " + sub[j] [3] + "\t\t"+"%.2f", sum/3 );
            System.out.printf("");
            System.out.println("\n-------------------------------------------------------------");
        }
    }
}