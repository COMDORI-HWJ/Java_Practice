package com.comdori;
import java.io.*;//아스키코드를 위한 라이브러
import java.util.Scanner;

public class lab1_1 {

    public static void main(String[] ar) throws IOException {
        String name; //이름
        int studnetnum; //학번
        int sex; //성


        Scanner scan = new Scanner(System.in);

        System.out.println("======================");
        System.out.println("학번: 20150000");
        System.out.println("이름: 컴돌이");
        System.out.println("======================");

        System.out.println("\n이름 : ");
        name = scan.next();	//이름 입력 받기
        System.out.println("학번: ");
        studnetnum = scan.nextInt(); //학번 입력 받기(학번이 길수 있으므로 long 식별자 사용)
        System.out.println("성별  (남자: 1, 여자:2 ) \n");
        sex = System.in.read() - 48; //아스키코드를 이용하여 1일 경우 남자 그외는 여자 입니다.



        System.out.println("이름 "+name+"이고, 학번 "+studnetnum+"이며 성별은 "+(sex == 1 ? "남자" : sex == 2 ? "여자" : "성별이 뭐죠?" )+ "입니다."); //출력문
    }

}