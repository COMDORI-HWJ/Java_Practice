package HW6;

import java.util.Scanner;

public class Pig {
    public static void main(String[] args) {
        PairOfDice me = new PairOfDice();// 나!
        PairOfDice com = new PairOfDice();// 컴퓨터!
        boolean turn = true;// true일 때 사용자, false일 때 컴퓨터의 차례이다.
        int i = 1;// 몇 판 하는지 볼까?
        boolean switchturn = true;

        Scanner sc = new Scanner(System.in);
        String bing = "";//차례 넘기기 위해

        System.out.println("게임 스타트!");

        do {
            while (turn) {// 차례가 다 있음
                System.out.println();
                System.out.println("-----" + i + "번째 판-----");
                System.out.println();
                System.out.println("너 차례");
                System.out.print("안하고 차례 돌릴려면 [돌려]라고 입력! 계속이면 아무키 입력! ");
                bing = sc.next();
                if(bing.equals("돌려")){
                    System.out.println("컴퓨터에게 차례가 넘어갑니다.");
                    turn = false;
                    break;
                }

                me.setDie();// 주사위 돌림
                if (me.die_fir == 1 || me.die_sec == 1) {// 주사위 값 한개가 1이면
                    System.out.println("너 주사위 나온 값: " + me.die_fir + " " + me.die_sec);
                    System.out.println("주사위 값 하나가 1이어서 점수 안넣을 거임ㅎ");
                    System.out.println("너 총 값: " + me.total);
                } else if (me.die_fir == 1 && me.die_sec == 1) {// 주사위 값 두개가 1이면
                    me.nototal();// 지금까지의 점수는 없었던 걸로...
                    System.out.println("너 주사위 나온 값: " + me.die_fir + " " + me.die_sec);
                    System.out.println("망했습니다. 망함!");
                    System.out.println("너 총 값: " + me.total);
                } else {
                    System.out.println("너 주사위 나온 값: " + me.die_fir + " " + me.die_sec);
                    System.out.println("너 총 값: " + me.gettotal((int) me.round()));
                }

                turn = false;// 차례 돌려줌
                i++;// 몇판하는지 셀려고
                System.out.println();
            }

            while(!turn){
                System.out.println("내 차례");
                if (com.total > 20 && switchturn) {
                    System.out.println("20점 초과! 당신 차례입니다..");
                    turn = true;
                    switchturn = false;//한번만 차례 넘겨줄거임
                    break;
                }
                com.setDie();// 주사위 돌림
                if (com.die_fir == 1 || com.die_sec == 1) {// 주사위 값 한개가 1이면
                    System.out.println("내 주사위 나온 값: " + com.die_fir + " " + com.die_sec);
                    System.out.println("주사위 값 하나가 1이어서 점수가 없습니다");
                    System.out.println("내 총 값: " + com.total);
                } else if (com.die_fir == 1 && com.die_sec == 1) {// 주사위 값 두개가
                    // 1이면
                    com.nototal();// 지금까지의 점수는 없었던 걸로...
                    System.out.println("내 주사위 나온 값: " + com.die_fir + " " + com.die_sec);
                    System.out.println("점수가 없습니다");
                    System.out.println("내 총 값: " + com.total);
                } else {
                    System.out.println("내 주사위 나온 값: " + com.die_fir + " " + com.die_sec);
                    System.out.println("내 총 값: " + com.gettotal((int) com.round()));
                }
                turn = true;// 차례 돌려줌
            }

        } while (me.total < 100 && com.total < 100);

        // 승패 출력
        System.out.println();
        if (me.total > 100) {
            System.out.println("너님 승리!");
        } else if (com.total > 100) {
            System.out.println("나님 승리!");
        }

    }
}