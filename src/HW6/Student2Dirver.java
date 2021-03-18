package HW6;

import java.util.Scanner;

//9번 문제 입니다.

class Student2{
    private String name;  //학생의 이름
    private int mid;  //학생의 중간시험 성적
    private int fin;  //학생의 기말시험 성적

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getmid() {
        return mid;
    }

    public void setmid(int mid) {
        if(mid >= 0 && mid <= 100){
            this.mid = mid;
        }else{
            System.out.println("시험점수가 0보다 작거나 100보다 크다.");
        }
    }

    public double getfin() {
        return fin;
    }

    public void setfine(int fin) {
        if(fin >= 0 && fin <= 100){
            this.fin = fin;
        }else{
            System.out.println("시험점수가 0보다 작거나 100보다 크다.");
        }
    }

    public void Student(String name) {
        setName(name);
    }

    public double calAverage() {
        double average = (double)(mid+fin)/2;
        return average;
    }
}

public class Student2Dirver {
    private static Scanner sc;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Student2 st1= new Student2();
        Student2 st2= new Student2();

        double avg;
        int mid;
        int fin;
        sc = new Scanner(System.in);
        while(true){
            System.out.println("학생1의 중간점수를 입력하세요: ");
            mid=sc.nextInt();
            if(mid<0 || mid>100){
                System.out.println("점수 값이 올바르지 않아요!");
                continue;

            } else{
                break;
            }
        }

        st1.setmid(mid);
        while(true){
            System.out.println("학생1의 기말점수를 입력하세요: ");
            fin=sc.nextInt();
            if(fin<0 || fin>100){
                System.out.println("점수 값이 올바르지 않아요!");
                continue;
            } else{
                break;
            }
        }

        st1.setfine(fin);
        avg=st1.calAverage();
        System.out.println("평균: "+avg);
        while(true){
            System.out.println("학생2의 중간점수를 입력하세요: ");
            mid=sc.nextInt();
            if(mid<0||mid>100){
                System.out.println("점수 값이 올바르지 않아요!");
                continue;
            }else{
                break;
            }
        }
        st2.setmid(mid);
        while(true){
            System.out.println("학생2의 기말점수를 입력하세요: ");
            fin=sc.nextInt();
            if(fin<0 || fin>100){
                System.out.println("점수 값이 올바르지 않아요!");
                continue;
            } else{
                break;
            }
        }
        st2.setfine(fin);
        avg=st2.calAverage();
        System.out.println("평균 "+avg);
    }
}