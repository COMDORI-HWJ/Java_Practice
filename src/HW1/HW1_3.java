package HW1;

import java.util.Random;
import java.util.Scanner;

public class HW1_3 { //간단한 가위바위보 자바 게
    public static void main(String[] args) {
        System.out.println("================");
        System.out.println("학번: 2015\n이름:홍길동");
        System.out.println("================");
        Scanner kbd = new Scanner(System.in);
        final String s[] = {"가위", "바위", "보"};
        int userChoice, computerChoice;
        while(true){
            System.out.println("가위 바위 보 게임!");
            System.out.println("다음 중 선택 해주세요! ");
            System.out.println("1. 가위 2. 바위 3. 보 4.끝내기 ");
            userChoice=kbd.nextInt();
            if (userChoice == 4)
                break; // 게임 끝내기
            computerChoice = (int) Math.round(Math.random() * 2 + 1);
// 1부터 3까지의 수
            if (userChoice < 1 || userChoice > 3) {
                System.out.println("잘못 입력하셨습니다.");
            } else {
                System.out.println("컴퓨터는 " + s[computerChoice-1]
                        + "를 냈습니다.");
                int diff = userChoice - computerChoice;
                switch (diff) {
                    case 0: // 같은 것을 낸 경우
                        System.out.println("비겼습니다.");
                        break;
                    case -1: // 사용자가 가위, 컴퓨터가 바위 또는 사용자가 바위, 컴퓨터가 보
                    case 2: // 사용자가 보, 컴퓨터가 가위
                        System.out.println("당신이 졌습니다.");
                        break;
                    case 1: // 사용자가 바위, 컴퓨터가 가위 또는 사용자가 보, 컴퓨터가 바위
                    case -2: // 사용자가 가위, 컴퓨터가 보
                        System.out.println("당신이 이겼습니다.");
                }
            }
        }
    }
}