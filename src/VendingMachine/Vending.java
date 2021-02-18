package VendingMachine;

import javax.swing.JFrame;

//이 클래스를 시작해야 자판기 프로그램이 작동됨.

public class Vending {
    int order = 0;

    public static void main(String[] args) {
        JFrame frame = new VendingGUI(); //VendingFram 메소드를 불러오는 구문.
        frame.setVisible(true); //프로그램이 보이도록 설정.
    }

}
