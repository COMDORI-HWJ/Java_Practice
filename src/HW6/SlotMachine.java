package HW6;

import java.util.Scanner;

class Slot{
    int n1;
    int n2;
    int n3;
    public Slot(){
        n1=(int)(Math.random()*10);
        n2=(int)(Math.random()*10);
        n3=(int)(Math.random()*10);
    }
    public void ok(){
        if(n1==n2&&n2==n3){
            System.out.println("1등에 당첨되었습니다!!!");}
        else if(n1==n2 || n1==n3 || n2==n3){
            System.out.println("2등에 당첨되었습니다!!!");
        }
        else{
            System.out.println("꽝입니다!!!");
        }

    }
}

public class SlotMachine {

    private static Scanner sc;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String Yes ="예";
        sc = new Scanner(System.in);
        do{
            Slot A = new Slot();
            System.out.println(A.n1+" "+A.n2+" "+A.n3);
            A.ok();
            System.out.println("계임을 계속 할래요?");
            Yes=sc.next();

        }while(Yes.equals("예"));

    }
}