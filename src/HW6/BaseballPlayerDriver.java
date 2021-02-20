package HW6;

import java.util.Scanner;

class Baseballplayer{
    String name;
    String position;
    int hit;
    int walk;

    public Baseballplayer(String name, String position, int hit, int walk){
        this.name=name;
        this.position=position;
        this.hit=hit;
        this.walk=walk;
    }
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name=name;

    }
    public String getposition(){
        return position;
    }
    public void setposition(String position){
        this.position=position;
    }
    public int gethit(){
        return hit;
    }
    public void sethit(int hit){
        this.hit=hit;
    }
    public int getwalk(){
        return walk;
    }
    public void setwalk(int walk){
        this.walk=walk;
    }
}

public class BaseballPlayerDriver {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        Baseballplayer[] b= new Baseballplayer[9];

        for(int i=0;i<9;i++){
            System.out.println("선수의 이름, 위치, 안타수4구수를 입력: ");
            b[i]=new Baseballplayer(sc.next(), sc.next(), sc.nextInt(), sc.nextInt());
        }
        System.out.println("\n \t 각 선수 통계치 \t \t");
        System.out.println("이름\t 위치 \t안타수\t\t 4구수");
        for(int i=0;i<b.length;i++){
            System.out.println(b[i].getname()+" "+b[i].getposition()+"  "+b[i].gethit()+"  \t"+b[i].getwalk());
        }
    }
}