package HW1;

import java.util.Scanner;

public class HW1_1 {

    public static int money = 0; // 사용자가 가지고 있는 금액 변수 지정.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("======================\n학번: 20160000\n이름: 컴돌이\n======================");

        do {
            String check = "Y"; // 메뉴에서 Y선택시 반복하여 진행
            System.out.println("상품의 가격을 정해주세요.");
            System.out.println("컴퓨터: ");
            Order.com_price = scan.nextInt(); // 컴퓨터 가격 입력받기.
            System.out.println("휴대폰: ");
            Order.phone_price = scan.nextInt(); // 휴대폰 가격 입력받기.
            System.out.println("TV: ");
            Order.tv_price = scan.nextInt(); // TV 가격 입력받기.

            do {
                System.out.println("돈을 입력해주세요.");
                Order.money = scan.nextInt();// 사용자가 가지고 있는 금액 입력받기.

                System.out.println("상품을 선택하세요.");
                System.out.println("|1. 컴퓨터: ￦" + Order.com_price + "|");
                System.out.println("|2. 휴대폰: ￦" + Order.phone_price + "|");
                System.out.println("|3. TV: ￦" + Order.tv_price + "|");
                Order.showMenu(); // Order클래스에서 계산후 출력.
                System.out.println("계속하시겠습니까? (y/n)");
                check = scan.next();// 계속 할것인지 입력받기.
                if ((check.equalsIgnoreCase("Y"))) {
                    continue;// 계속하여 진행됨.
                } else if ((check.equalsIgnoreCase("n"))) {
                    System.exit(0);// 프로그램이 종료됨.
                }
            } while (true);
        } while (true);
    }
}
