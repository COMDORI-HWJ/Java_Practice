package lab5;

import javax.swing.*;
import java.awt.*;

public class Lab5_2 extends JFrame {

    Lab5_2() {
        System.out.println("======================\n학번: 20160000\n이름: 컴돌이\n======================");
        setTitle("컴돌이 프레임");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 종료 버튼이 클릴될 때 프레임을 닫는 소스.
        Container c = getContentPane();		//판넬 변수를 c로 지정
        c.setBackground(Color.YELLOW);		//색은 YELLOW로 지정
        c.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));		//버튼 간격을 지정
        c.add(new JButton("+"));		//버튼 네임
        c.add(new JButton("-"));		//버튼 네임
        c.add(new JButton("*"));		//버튼 네임
        c.add(new JButton("/"));		//버튼 네임
        c.add(new JButton("="));		//버튼 네임
        c.add(new JButton("1"));		//버튼 네임
        c.add(new JButton("2"));		//버튼 네임
        c.add(new JButton("2"));		//버튼 네임
        c.add(new JButton("3"));		//버튼 네임
        c.add(new JButton("4"));		//버튼 네임
        c.add(new JButton("5"));		//버튼 네임
        c.add(new JButton("6"));		//버튼 네임
        c.add(new JButton("7"));		//버튼 네임
        c.add(new JButton("8"));		//버튼 네임
        c.add(new JButton("9"));		//버튼 네임
        c.add(new JButton("0"));		//버튼 네임
        setSize(300, 200);				//프레임 크기
        setVisible(true);
    }

    public static void main(String[] args) {
        new Lab5_2();

    }
}
