package HW1;

import java.util.Scanner;

public class Order {

    static int com_price = 0, phone_price = 0, tv_price = 0, money;
    static String Menu;
    String item;

    static Scanner scan = new Scanner(System.in);

    public static void showMenu() {

        Menu = scan.next();
        if ("1".equals(Menu)) {// 1번 메뉴 컴퓨터 이벤트
            if (money < Order.com_price) {
                System.out.println("선택한 상품은 컴퓨터 입니다.");
                System.out.println("돈이 부족합니다.");
            } else {
                System.out.println("선택한 상품은 컴퓨터 입니다.");
                money = money - com_price;
                System.out.println("남은돈은 " + money + "원 입니다.");
            }
        } else if ("2".equals(Menu)) {// 2번 메뉴 휴대폰 이벤트
            if (money < phone_price) {
                System.out.println("선택한 상품은 휴대폰 입니다.");
                System.out.println("돈이 부족합니다.");
            } else {
                System.out.println("선택한 상품은 휴대폰 입니다.");
                money = money - phone_price;
                System.out.println("남은돈은 " + money + "원 입니다.");
            }
        } else if ("3".equals(Menu)) {// 3번 메뉴 TV 이벤트
            if (money < tv_price) {
                System.out.println("선택한 상품은 TV 입니다.");
                System.out.println("돈이 부족합니다.");
            } else {
                System.out.println("선택한 상품은 TV 입니다.");
                money = money - tv_price;
                System.out.println("남은돈은 " + money + "원 입니다.");
            }
        } else {// 다른 수를 입력 받았을때의 이벤트
            System.out.println("처음부터 다시해주세요.");
            return;
        }
    }

    public static void setPrice(String item, int price) {// 가격 변수 연결
        if (item == "COMPUTER") {
            com_price = com_price;
        } else if (item == "Phone") {
            phone_price = phone_price;
        } else if (item == "TV") {
            tv_price = tv_price;
        }
    }

    void Result(int money, int menu) {
        return;
    }
}
