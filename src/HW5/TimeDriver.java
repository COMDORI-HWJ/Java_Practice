package HW5;

import java.util.Scanner;

public class TimeDriver {

    private static Scanner sc;

    public static void main(String[] args) {

        sc = new Scanner(System.in);

        System.out.println("시, 분, 초를 입력하시오.");
        Time t = new Time(sc.next(), sc.next(), sc.next());
        System.out.println("입력된 시간 : " + t.getHour() + "시 " + t.getMinute() + "분 " + t.getSecond() + "초\n");

        t.setCurrentTime();
        System.out.println("현재 시간 : " + t.getCurrentHour() + "시 " + t.getCurrentMinute() + "분 " + t.getCurrentSecond() + "초\n");
        t.varyHour();
        t.varyMinute();
        t.varySecond();

        System.out.println();
        System.out.println("변경 후 시간 : " + t.getHour() + "시 " + t.getMinute() + "분 " + t.getSecond() + "초\n");
    }
}

