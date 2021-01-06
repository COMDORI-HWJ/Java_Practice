package com.comdori;

public class test1 {

    public static void main(String[] args) {
        int i, j;
        for (j=0,i=1; i <= 10; i++) { //1에서 10까지 덧셈 하기
            j += i;
            System.out.print(i);
            if(i==10) {
                System.out.print("=");
                System.out.print( j);
            }
            else
                System.out.print("+");
        }
    }
}