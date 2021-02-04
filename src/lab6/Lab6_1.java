package lab6;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Lab6_1 extends JFrame {
    JPanel c = new JPanel();
    JLabel message = new JLabel("시작합니다"); //게임 상태 메시지
    JLabel x = new JLabel("0");	//첫 번째 라벨
    JLabel y = new JLabel("0");
    JLabel z = new JLabel("0");

    Lab6_1() {
        System.out.println("======================\n학번: 20140000\n이름: 컴돌이\n======================");
        setTitle("컴돌이 프레임");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(c);
        c.setLayout(null);
        message.setLocation(100, -10);		//메시지 좌표값
        message.setSize(500, 90);
        message.setFont(new Font("맑은 고딕", Font.BOLD, 15));		//메시지의 글꼴
        c.add(message);		//메시지 아벨 판넬에 추가
        c.addKeyListener(new key(this));


        x.setLocation(80, 50);		//첫 번째 숫자 부분
        x.setSize(50, 90);
        x.setFont(new Font("맑은 고딕", Font.BOLD, 30));
        c.add(x);			//첫 번째 숫자 라벨 판넬에 추가


        y.setLocation(160, 50);		//두 번째 숫자 부분
        y.setSize(50, 90);
        y.setFont(new Font("맑은 고딕", Font.BOLD, 30));
        c.add(y);			//두 번째 숫자 라벨 판넬에 추가

        z.setLocation(120, 50);		//세 번째 숫자 부분
        z.setSize(50, 90);
        z.setFont(new Font("맑은 고딕", Font.BOLD, 30));
        c.add(z);					//세 번째 숫자 라벨 판넬에 추가

        setSize(300, 200);		//프레임 창 크기
        setVisible(true);
        c.requestFocus();		//판넬에서 키 입력을 받기위한 구문
    }

    public static void main(String[] args) {
        new Lab6_1();
    }
}

class key extends KeyAdapter {
    Lab6_1 main;// Lab6_1 객체 변수
    key(Lab6_1 f) {// key 클래스를 생성하였을 때, Lab6_1 객체를 받아온다.

        main = f;
    }
    public void keyPressed(KeyEvent e) {

        int r = (int) (Math.random() * 5);		//첫 번째 숫자의 랜덤 함수
        int g = (int) (Math.random() * 5);		//두 번째 숫자의 랜덤 함수
        int b = (int) (Math.random() * 5);		//세 번째 숫자의 랜덤 함수
        if (e.getKeyChar() == '\n') {			//엔터의 입력값을 받는다.

            main.x.setText("" + r);
            main.y.setText("" + g);
            main.z.setText("" + b);

        }
        if (r == g && g == b && b == r) {				//모두 같은수 일때
            main.message.setText("모두 같은수 입니다");		//메시지를 출력 한다.
        }
        else {
            main.message.setText("아쉽군요");				//아닐때의 메시지 출력.
        }
    }
}
