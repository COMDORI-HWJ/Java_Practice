package VendingMachine;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class VendingGUI extends JFrame {
  public VendingGUI() {
        setTitle("음료수 자판기"); // 프로그램 제목 설정
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new VendingBord();
        this.add(panel);
        setSize(500,300); // 프로그램 창 크기 설정
    }
}